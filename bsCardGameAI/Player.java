import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Player implements BSPlayer{

	public ArrayList<Integer> hand;
	public int player_num;
	public Random random = new Random();

	public int type;
	public int version;


	public int current_rank;
	public int tentative_num_add_cards;


	public Stack<Integer> known_pile;
	public Stack<Integer> possible_pile;
	public ArrayList<ArrayList<Integer>> possible_opponent_hands;
	public ArrayList<ArrayList<Integer>> known_opponent_hands;
	public int[] player_hand_sizes;





	public Player(int type, int version) {
		this.type = type;
		this.version = version;
	}


	@Override
	public void start_game(ArrayList<Integer> hand, int player_num, int starting_player_num) {
		this.hand = hand;
		this.player_num = player_num;
		this.possible_pile = new Stack<Integer>();
		this.known_pile = new Stack<Integer>();
		this.known_pile.add(Card.ACE);
		this.known_opponent_hands = new ArrayList<ArrayList<Integer>>();
		this.possible_opponent_hands = new ArrayList<ArrayList<Integer>>();
		this.player_hand_sizes = new int[BSGame.NUM_PLAYERS];
		for (int i = 0; i < BSGame.NUM_PLAYERS; i++){
			this.known_opponent_hands.add(new ArrayList<Integer>());
			this.possible_opponent_hands.add(new ArrayList<Integer>());
			this.player_hand_sizes[i] = i == starting_player_num ? 12 : 13;
		}
	}



	@Override
	public void add_to_hand(Stack<Integer> cards) {
		this.hand.addAll(cards);
	}



	@Override
	public ArrayList<Integer> get_play(int current_rank) {
		this.current_rank = current_rank;
		ArrayList<Integer> discard = new ArrayList<>();
		if (version == BlackBox.SIMPLE) {
			ArrayList<Integer> cards = BSutil.get_cards_of_rank(hand, current_rank);
			if (cards.isEmpty()) {
				cards.add(hand.get(0));
			}
			BSutil.remove_cards(hand, cards);
			known_pile.addAll(cards);
			discard = cards;
		}
		else {
			ArrayList<ArrayList<Integer>> potential_discard_sets = BSutil.get_potential_discard_sets(this.hand);
			double max_val = -Double.MAX_VALUE;
			ArrayList<Integer> best_discard_set = new ArrayList<Integer>();
			for (ArrayList<Integer> potential_discard_set : potential_discard_sets) {
				// add ranks to known pile
				known_pile.addAll(potential_discard_set);
				BSutil.remove_cards(hand, potential_discard_set);
				double val = BlackBox.prob_of_winning(this);
				if (max_val < val) {
					max_val = val;
					best_discard_set = potential_discard_set;
				}
				BSutil.remove_cards(known_pile, potential_discard_set);
				hand.addAll(potential_discard_set);
			}
			known_pile.addAll(best_discard_set);
			discard = best_discard_set;
		}
		this.player_hand_sizes[player_num] -= discard.size();
		return discard;
	}




	@Override
	public boolean report_play_get_call(int playing_player_num, int num_cards_played, int card_rank) {
		
		this.tentative_num_add_cards = num_cards_played;
		for (int i = 0; i < num_cards_played; i++) {
			possible_pile.add(current_rank);
		}
		this.current_rank = card_rank;
		this.player_hand_sizes[playing_player_num] -= num_cards_played;
		
//		System.out.println("(RPGC) from Player " + player_num + ": " + Arrays.toString(player_hand_sizes));

		if (version == BlackBox.SIMPLE) {
			int num_same_rank_cards = BSutil.get_cards_of_rank(hand, card_rank).size();
			if (num_same_rank_cards + num_cards_played > 4 || (random.nextBoolean() && random.nextBoolean())) {
				return true;
			} else {
				return false;
			}
		}
		
		return BlackBox.shouldCall(this);
	}



	@Override
	public void report_call_result(int playing_player_num, int calling_player_num, int call_state) {

		if (call_state == BSutil.NOT_CALLED) {
		}
		else if (call_state == BSutil.CALLED_AND_BLUFF) {
//			System.out.println(1);
			// move known pile cards into known playing player hand
			known_pile.remove(Card.ACE);
			known_opponent_hands.get(playing_player_num).addAll(known_pile);
			this.player_hand_sizes[playing_player_num] += known_pile.size();
			known_pile.clear();
			known_pile.add(Card.ACE);
			// move possible pile cards into possible playing player hand
			possible_opponent_hands.get(playing_player_num).addAll(possible_pile);
			this.player_hand_sizes[playing_player_num] += possible_pile.size();
			possible_pile.clear();
		}
		else if (call_state == BSutil.CALLED_AND_TRUTH) {
//			System.out.println(2);
			// move known pile into known calling player hand
//			System.out.println(known_pile);
			known_pile.remove(Card.ACE);
			known_opponent_hands.get(calling_player_num).addAll(known_pile);
			this.player_hand_sizes[calling_player_num] += known_pile.size();
			known_pile.clear();
			known_pile.add(Card.ACE);
			// move possible pile cards into possible calling player hand
			possible_opponent_hands.get(calling_player_num).addAll(possible_pile);
//			System.out.println(possible_pile);
			this.player_hand_sizes[calling_player_num] += possible_pile.size();
			possible_pile.clear();
		}
		
//		System.out.println("(RCR) from Player " + player_num + ": " + Arrays.toString(player_hand_sizes));

	}



}
