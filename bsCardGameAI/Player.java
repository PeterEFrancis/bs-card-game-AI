import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Player implements BSPlayer{

	public ArrayList<Integer> hand;
	public int playerNum;
	public Random random = new Random();

	public int type;
	public int version;


	public int current_rank;
	public int tentative_num_add_cards;

	// only keep track of ranks
	public Stack<Integer> known_pile;
	public Stack<Integer> possible_pile;
	public ArrayList<ArrayList<Integer>> possible_opponent_hands;
	public ArrayList<ArrayList<Integer>> known_opponent_hands;





	public Player(int type, int version) {
		this.type = type;
		this.version = version;
	}


	@Override
	public void start_game(ArrayList<Integer> hand, int playerNum) {
		this.hand = hand;
		this.playerNum = playerNum;
		this.possible_pile = new Stack<Integer>();
		this.known_pile = new Stack<Integer>();
		this.known_pile.add(Card.ACE);
		this.known_opponent_hands = new ArrayList<ArrayList<Integer>>();
		this.possible_opponent_hands = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 4; i++){
			this.known_opponent_hands.add(new ArrayList<Integer>());
			this.possible_opponent_hands.add(new ArrayList<Integer>());
		}
	}



	@Override
	public void add_to_hand(Stack<Integer> cards) {
		this.hand.addAll(cards);
	}



	/**
	 * Do a shallow search for the best discard set of cards.
	 */
	@Override
	public ArrayList<Integer> get_play(int current_rank) {
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
		return best_discard_set;
	}




	@Override
	public boolean report_play_get_call(int playing_player_num, int num_cards_played, int card_rank) {
		this.tentative_num_add_cards = num_cards_played;
		this.current_rank = card_rank;
		return BlackBox.shouldCall(this);
	}



	@Override
	public void report_call_result(int playing_player_num, int calling_player_num, int call_state) {
		if (call_state == BSutil.NOT_CALLED) {
			// add tentative card ranks to possible pile
			for (int i = 0; i < tentative_num_add_cards; i++) {
				possible_pile.add(current_rank);
			}
		}
		else if (call_state == BSutil.CALLED_AND_BLUFF) {
			// move known pile cards into known playing player hand
			known_pile.remove(Card.ACE);
			known_opponent_hands.get(playing_player_num).addAll(known_pile);
			known_pile.clear();
			known_pile.add(Card.ACE);
			// move possible pile cards into possible playing player hand
			possible_opponent_hands.get(playing_player_num).addAll(possible_pile);
			possible_pile.clear();
		}
		else if (call_state == BSutil.CALLED_AND_TRUTH) {
			// move known pile into known calling player hand
			known_pile.remove(Card.ACE);
			known_opponent_hands.get(calling_player_num).addAll(known_pile);
			known_pile.clear();
			known_pile.add(Card.ACE);
			// move possible pile cards into possible calling player hand
			possible_opponent_hands.get(calling_player_num).addAll(possible_pile);
			possible_pile.clear();
		}
	}



}
