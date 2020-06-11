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
		hand.removeAll(cards);
		return cards;
	}

	
	/**
	 * If the number of cards played is greater than four minus the number of cards of the card_rank in hand, then call BS at 10.
	 * Otherwise, with probability 1/2, call at a proportion of 2 * number of same-rank cards in hand, or call 0.
	 * @param playing_player_num - player number of the player that discarded
	 * @param num_cards_played - number of cards that playing player discarded
	 * @param card_rank - rank that the playing player was "supposed to" discard
	 * @return the "dispute amount", an integer between 0 and 10, that corresponds to how much you dispute the play.
	 *         0 is silence and the player with the highest nonzero dispute amount will call BS
	 **/
	@Override
	public int report_play_get_call(int playing_player_num, int num_cards_played, int card_rank) {
		int num_same_rank_cards = BSutil.get_cards_of_rank(hand, card_rank).size();
		if (num_same_rank_cards + num_cards_played > 4) {
			return 10;
		} else if (random.nextBoolean()) {
				return num_same_rank_cards * 2;
		} else {
			return 0;
		}
	}

	@Override
	public void report_call_result(int playing_player_num, int calling_player_num, boolean was_bluff) {
		// Simple Player doesn't do anything with this.
	}

}
