import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class BSGame {

	public static int NUM_PLAYERS = 4;

	BSPlayer[] players;
	Random random;
	ArrayList<ArrayList<Integer>> hands;
	int current_player_num;
	Stack<Integer> pile;
	boolean verbose;


	public BSGame(BSPlayer[] players) {
		this.players = players;
		this.random = new Random();
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
		int ace_count = 0;
		for (int i = 0; i < Card.NUM_CARDS; i++) {
			int card = deck.pop();
			if (card == Card.ACE) {
				if (ace_count == rand_ace) {
					current_player_num = i % NUM_PLAYERS;
				}
				ace_count++;
			} else {
				hands.get(i % NUM_PLAYERS).add(card);
			}
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
			players[j].start_game((ArrayList<Integer>) hands.get(j).clone(), j);
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
					calling_player_num = i;
					if (verbose)
						System.out.println("Player " + i + " calls.");
					break;
				} else if (verbose) {
					System.out.println("Player " + i + " passes.");
				}
			}

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

			if (verbose) {for (int i = 0; i < NUM_PLAYERS; i++)
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


	public static void main(String[] args) {
		// play a verbose game
		SimpleBSPlayer player0 = new SimpleBSPlayer();
		SimpleBSPlayer player1 = new SimpleBSPlayer();
		SimpleBSPlayer player2 = new SimpleBSPlayer();
		SimpleBSPlayer player3 = new SimpleBSPlayer();
		SimpleBSPlayer[] players = new SimpleBSPlayer[] {player0, player1, player2, player3};

		BSGame game = new BSGame(players);
		game.verbose = true;
		game.play();
	}


}
