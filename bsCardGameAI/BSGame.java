import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class BSGame {

	boolean verbose = false;
	
	public boolean collecting = false;
	public StringBuilder discard_data_string;
	public StringBuilder call_data_string;



	public static int NUM_PLAYERS = 4;

	BSPlayer[] players;
	Random random;
	ArrayList<ArrayList<Integer>> hands;
	int current_player_num;
	Stack<Integer> pile;


	public BSGame(BSPlayer[] players) {
		this.players = players;
		this.random = new Random(2);
	}


	@SuppressWarnings("unchecked")
	public int play() {

		if (verbose)
			System.out.println("Starting game.");

		
		// reset
		hands = new ArrayList<ArrayList<Integer>>();
		current_player_num = -1;
		pile = new Stack<Integer>();


		// get hands and starting player
		Stack<Integer> deck = Card.get_shuffled_deck(random.nextLong());
		for (int i = 0; i < NUM_PLAYERS; i++) {
			ArrayList<Integer> hand = new ArrayList<>();
			hands.add(hand);
		}
		int rand_ace = random.nextInt(4);
		int ace_count = -1;
		for (int i = 0; i < Card.NUM_CARDS; i++) {
			int card = deck.pop();
			if (card == Card.ACE) {
				ace_count++;
				if (ace_count == rand_ace) {
					current_player_num = i % NUM_PLAYERS;
					continue;
				}				
			}
			hands.get(i % NUM_PLAYERS).add(card);
		}

		if (verbose) {
			for (int i = 0; i < NUM_PLAYERS; i++)
				System.out.println("Player " + i + " hand: " + Card.string(hands.get(i)));
			System.out.println("Starting Player: " + current_player_num);
		}


		int current_rank = 0;
		pile.add(Card.ACE);
		if (verbose)
			System.out.println("Pile: " + Card.string(pile));



		// start game
		for (int j = 0; j < NUM_PLAYERS; j++) {
			players[j].start_game((ArrayList<Integer>) hands.get(j).clone(), j, current_player_num);
		}


		// take turns
		int winner = -1;

		while (winner == -1) {

			current_player_num = (current_player_num + 1) % NUM_PLAYERS;
			current_rank = (current_rank + 1) % Card.NUM_RANKS;

			if (verbose)
				System.out.println("\n " + Card.RANKS.charAt(current_rank) + " ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓");

			
			ArrayList<Integer> play = players[current_player_num].get_play(current_rank);
			if (verbose)
				System.out.println("Player " + current_player_num + " plays " + Card.string(play));


			// check for illegal play -- make sure that the real play is in the player's hand
			for (int i = 0; i < play.size(); i++) {
				if (!hands.get(current_player_num).contains(play.get(i))) {
					System.err.println("Illegal play -- discard has cards not in hand");
				}
			}

			// remove play cards from player hand and put them into the pile
			for (int c : play) {
				hands.get(current_player_num).remove((Integer) c);
				pile.push(c);
			}

			if (verbose)
				System.out.println("\tPile: " + Card.string(pile));


			// report play to all players and get calling players
			// if more than one player called at the same level, the first one is chosen
			int calling_player_num = -1;
			for (int i = (current_player_num + 1) % NUM_PLAYERS; i != current_player_num; i = (i + 1) % NUM_PLAYERS) {
				if (players[i].report_play_get_call(current_player_num, play.size(), current_rank)) {
					if (calling_player_num == -1) {
						calling_player_num = i;
					}
					if (verbose)
						System.out.println("Player " + i + " calls.");
				} else if (verbose) {
					System.out.println("Player " + i + " passes.");
				}
			}
			
						
			// Collect data for proper discard v
			if (collecting) {
				double[] features = BSutil.calculate_discard_features((Player) players[current_player_num]);
				for (double feature : features) {
					discard_data_string.append(feature + ",");
				}
				discard_data_string.append("\n");
			}
			// Collect data for proper discard ^


			// make a call (if one player calls above a 0)
			// and check if play was a bluff
			boolean bluff = false;
			if (calling_player_num != -1) {
				for (int i = 0; i < play.size(); i++) {
					if (play.get(i) != current_rank) {
						bluff = true;
					}
				}

				pile.remove(Card.ACE);

				if (bluff) {
					// move pile cards to playing player
					players[current_player_num].add_to_hand(pile);
					hands.get(current_player_num).addAll(pile);
				}
				else {
					// move pile cards to playing player
					players[calling_player_num].add_to_hand(pile);
					hands.get(calling_player_num).addAll(pile);
				}

				pile.clear();
				pile.add(Card.ACE);

				if (verbose) {
					System.out.println("Play was " + (bluff ? "a bluff" : "real") + " -> Card pile given to Player " + (bluff ? current_player_num : calling_player_num));
				}

			}

			if (verbose) {
				for (int i = 0; i < NUM_PLAYERS; i++)
					System.out.println("\tPlayer " + i + " hand: " + Card.string(hands.get(i)));
			}
		
			// report call result to players
			int call_state = calling_player_num != -1 ? (bluff ? BSutil.CALLED_AND_BLUFF : BSutil.CALLED_AND_TRUTH) : BSutil.NOT_CALLED;
			for (int i = 0; i < NUM_PLAYERS; i++) {
				players[i].report_call_result(current_player_num, calling_player_num, call_state);
			}
			

			// check for winner
			for (int i = 0; i < NUM_PLAYERS; i++) {
				if (hands.get(i).size() == 0) {
					winner = i;

					if (verbose)
						System.out.println("Player " + winner + " wins!");
				}
			}
			

		}

		return winner;
	}

	public static String[] DISCARD_FEATURES = new String[] {
			"is_winner", // "player_num",
			"hand_size",
			"pile_size",
			"num_hand_ranks",
			"num_possible_pile_ranks",
			"min_turns_min_bluffs",
			"min_other_player_hand_size",
			"avg_other_player_hand_size",
			"prod_other_player_hand_size"
		};


	public void collect(String file_path, int num_games) throws FileNotFoundException {
		System.out.println("Starting to collect...");
		collecting = true;
		discard_data_string = new StringBuilder();
		call_data_string = new StringBuilder();
		PrintWriter pw = new PrintWriter(file_path);


		for (int i = 0; i < DISCARD_FEATURES.length - 1; i++) {
			pw.write(DISCARD_FEATURES[i] + ",");
		}
		pw.write(DISCARD_FEATURES[DISCARD_FEATURES.length - 1] + "\n");

		// iterate through game data
		for (int i = 0; i < num_games; i++) {
			int winner = play();
			for (String s : discard_data_string.toString().split("\n")) {
				int is_winner = winner == Double.parseDouble(s.charAt(0) + "") ? 1 : 0;
				int comma = s.indexOf(",");
				pw.write(is_winner  + "," + s.substring(comma + 1, s.length() - 1) + "\n"); // replace first feature "player_num" with "is_game_winner" and remove last comma
			}
		}

		// close PrintWriter
		pw.close();
		System.out.println("Done collecting!");
	}








	public static void main(String[] args) throws FileNotFoundException {
		// play a verbose game
		Player player0 = new Player(BlackBox.SIMPLE, BlackBox.SIMPLE);
		Player player1 = new Player(BlackBox.SIMPLE, BlackBox.SIMPLE);
		Player player2 = new Player(BlackBox.SIMPLE, BlackBox.SIMPLE);
		Player player3 = new Player(BlackBox.SIMPLE, BlackBox.SIMPLE);
		
		Player[] players = new Player[] {player0, player1, player2, player3};

		BSGame game = new BSGame(players);
//		game.play();
		
		int num_games = 300;
	
		String file_path = "alpha.csv";
		
		game.collect(file_path, num_games);
	}


}
