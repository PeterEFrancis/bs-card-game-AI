import java.util.ArrayList;

public class BSutil {

	public static ArrayList<Integer> get_cards_of_rank(ArrayList<Integer> cards, int rank) {
		ArrayList<Integer> same_rank_cards = new ArrayList<>();
		for (int c : cards) {
			if (Card.rank_of(c) == rank) {
				same_rank_cards.add(c);
			}
		}
		return same_rank_cards;
	}

	
}
