import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class SimpleBSPlayer implements BSPlayer{

	public ArrayList<Integer> hand;
	public int playerNum;
	public Random random = new Random();


	@Override
	public void start_game(ArrayList<Integer> hand, int playerNum) {
		this.hand = hand;
		this.playerNum = playerNum;
	}

	@Override
	public void add_to_hand(Stack<Integer> cards) {
		hand.addAll(cards);
	}


	/**
	 * If the hand has cards of that suit, return all of them. If not, just return the first card in the hand.
	 * @param current_rank - rank of the cards that "should" be discarded
	 * @return the cards to be put in the cards pile
	 */
	@Override
	public ArrayList<Integer> get_play(int current_rank) {
		ArrayList<Integer> cards = BSutil.get_cards_of_rank(hand, current_rank);
		if (cards.isEmpty()) {
			cards.add(hand.get(0));
		}
		BSutil.remove_cards(hand, cards);
		return cards;
	}


	/**
	 * If the number of cards played is greater than four minus the number of cards of the card_rank in hand, then call BS.
	 * Otherwise call at 25%.
	 * @param playing_player_num - player number of the player that discarded
	 * @param num_cards_played - number of cards that playing player discarded
	 * @param card_rank - rank that the playing player was "supposed to" discard
	 * @return if you are calling BS
	 **/
	@Override
	public boolean report_play_get_call(int playing_player_num, int num_cards_played, int card_rank) {
		int num_same_rank_cards = BSutil.get_cards_of_rank(hand, card_rank).size();
		if (num_same_rank_cards + num_cards_played > 4 || (random.nextBoolean() && random.nextBoolean())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void report_call_result(int playing_player_num, int calling_player_num, int call_state) {
		// Simple Player doesn't do anything with this.
	}

}
