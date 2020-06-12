import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BSutil {

	public static int CALLED_AND_BLUFF = 0;
	public static int CALLED_AND_TRUTH = 1;
	public static int NOT_CALLED = 2;



	public static ArrayList<Integer> get_cards_of_rank(ArrayList<Integer> cards, int rank) {
		ArrayList<Integer> same_rank_cards = new ArrayList<>();
		for (int r : cards) {
			if (r == rank) {
				same_rank_cards.add(r);
			}
		}
		return same_rank_cards;
	}


	@SuppressWarnings("unchecked")
	public static ArrayList<ArrayList<Integer>> get_potential_discard_sets(ArrayList<Integer> cards) {
		int[] rank_count = new int[Card.NUM_RANKS];
		for (int card : cards) {
			rank_count[card % Card.NUM_RANKS]++;
		}

		ArrayList<ArrayList<Integer>> potential_discard_sets = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < Card.NUM_RANKS; i++) {
			int card_count = rank_count[i];

			// make a copy of potential_discard_sets
			ArrayList<ArrayList<Integer>> copy_potential_discard_sets = new ArrayList<ArrayList<Integer>>();
			for (ArrayList<Integer> set : potential_discard_sets) {
				copy_potential_discard_sets.add((ArrayList<Integer>) set.clone());
			}
			// and add an empty set
			if (card_count != 0)
				copy_potential_discard_sets.add(new ArrayList<Integer>());

			// for each possible number j of cards of rank i that can be in a discard set,
			for (int j = 1; j <= card_count; j++) {
				// and for each set that does not have that rank already in it (the sets copied)
				for (ArrayList<Integer> set : copy_potential_discard_sets) {
					if (set.size() + j <= 4) {
						// add j cards of rank i
						ArrayList<Integer> new_set = (ArrayList<Integer>) set.clone();
						for (int k = 0; k < j; k++) {
							new_set.add(i);
						}
						potential_discard_sets.add(new_set);
					}
				}
			}
		}
		return potential_discard_sets;
	}

//	⊂_ヽ
//	　 ＼＼
//	　　 ＼( ͡° ͜ʖ ͡°)
//	　　　 >　⌒ヽ
//	　　　/ 　 へ＼
//	　　 /　　/　＼＼
//	　　 ﾚ　ノ　　 ヽ_つ
//	　　/　/
//	　 /　/|
//	　(　(ヽ
//	　|　|、＼
//	　| 丿 ＼ ⌒)
//	　| |　　) /
//	ノ )　　Lﾉ
//	(_／#tada


	public static void remove_cards(List<Integer> cards, ArrayList<Integer> to_remove) {
		for (Integer r : to_remove) {
			cards.remove(r);
		}
	}

	public static int get_num_ranks(List<Integer> cards){
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(cards);
		return set.size();
	}





	public static double[] calculate_discard_features(Player player) {
		
		int player_num = player.player_num;
		int hand_size = player.hand.size();
		int pile_size = player.known_pile.size() + player.possible_pile.size();
		int num_hand_ranks = get_num_ranks(player.hand);
		int num_possible_pile_ranks = get_num_ranks(player.known_pile) + get_num_ranks(player.possible_pile);

		return new double[] {
				player_num,
				hand_size,
				pile_size,
				num_hand_ranks,
				num_possible_pile_ranks
		};
	}


	



	public static void main(String[] args) {

		ArrayList<Integer> cards = new ArrayList<>();
		cards.add(0);
		cards.add(13);
		cards.add(26);
		cards.add(1);
		cards.add(14);
		cards.add(2);
		for (ArrayList<Integer> set : get_potential_discard_sets(cards))
			System.out.println(set);

}





}
