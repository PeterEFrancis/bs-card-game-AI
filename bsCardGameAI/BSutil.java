import java.util.ArrayList;
import java.util.Arrays;
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

//	 ⊂_ヽ
//	　 ＼＼
//	　　＼( ͡° ͜ʖ ͡°)
//	　　　 >　⌒ヽ
//	　　　/ 　 へ＼
//	　　 /　　/　＼＼
//	　　 ﾚ　ノ　　 ヽ_つ
//	　　/　/
//	　 /　/|
//	　(　(ヽ
//	　|　|、＼
//	　| 丿 ＼  ⌒
//	　| |　　) /
//	 ノ )　　Lﾉ
//	(_／ #tada


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

	public static void print(int[] num_cards_per_rank, Integer[] order) {
		System.out.print("[");
		for (int i = 0; i < order.length; i++) {
			System.out.print(num_cards_per_rank[order[i]]);
			if (i != order.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.print("]\n");
	}
	
	
	public static int get_min_turns_min_bluffs(ArrayList<Integer> cards, int current_rank) {
		Integer[] order = new Integer[Card.NUM_RANKS];
		Integer r = current_rank;
		for (int i = 0; i < Card.NUM_RANKS; i++) {
			order[i] = r;
			r = (r + BSGame.NUM_PLAYERS) % Card.NUM_RANKS;
		}
		
		int[] num_cards_per_rank = new int[Card.NUM_RANKS];
		for (Integer c : cards) {
			num_cards_per_rank[c]++;
		}

		int i = Card.NUM_RANKS - 1;
		while (i > 0) {

			while (num_cards_per_rank[order[i]] != 0) {
				
				int first_zero = -1;
				for (int j = 0; j < i - 1; j++) {
					if (num_cards_per_rank[order[j]] == 0) {
						first_zero = j;
						break;
					}
				}
				
				if (first_zero == -1) { // there is no zero to the left of i -> we are done!
					i = 1;
					break;
				} else if (first_zero == i - 1) { // i needs to be moved to another discard (so the last discard isn't a bluff)
					num_cards_per_rank[order[i]]--;
					num_cards_per_rank[order[0]] -= 0.5;
				} else { // i can be moved to first_zero
					num_cards_per_rank[order[i]]--;
					num_cards_per_rank[order[first_zero]]--;				
				}
			
			}
			
			i--;
		}

		int min_turns = 0;

		for(Integer current_turn : num_cards_per_rank) {
			if (current_turn != 0){
				min_turns++;
			}
		}

		return min_turns;
	}

	
	public static int get_min_other_player_hand_size(int player_num, int[] player_hand_sizes) {
		int min = Integer.MAX_VALUE;
		for (int pn = 0; pn < BSGame.NUM_PLAYERS; pn++) {
			int s = player_hand_sizes[pn];
			if (pn != player_num && s < min) {
				min = s;
			}
		}

		return min;
	}


	public static double get_avg_other_player_hand_size(int player_num, int[] player_hand_sizes) {
		double avg = 0;
		for (int pn = 0; pn < BSGame.NUM_PLAYERS; pn++) {
			if (pn != player_num) {
				avg += player_hand_sizes[pn];
			}
		}
		return avg / (BSGame.NUM_PLAYERS - 1);
	}
	
	public static int get_prod_other_player_hand_size(int player_num, int[] player_hand_sizes) {
		int prod = 1;
		for (int pn = 0; pn < BSGame.NUM_PLAYERS; pn++) {
			if (pn != player_num) {
				prod *= player_hand_sizes[pn];
			}
		}
		return prod;
	}
	
	public static double[] calculate_discard_features(Player player) {

		int player_num = player.player_num;
		int hand_size = player.hand.size();
		int pile_size = player.known_pile.size() + player.possible_pile.size();
		int num_hand_ranks = get_num_ranks(player.hand);
		int num_possible_pile_ranks = get_num_ranks(player.known_pile) + get_num_ranks(player.possible_pile);
		int min_turns_min_bluffs = get_min_turns_min_bluffs(player.hand, player.current_rank);
		int min_other_player_hand_size = get_min_other_player_hand_size(player.player_num, player.player_hand_sizes);
		double avg_other_player_hand_size = get_avg_other_player_hand_size(player.player_num, player.player_hand_sizes);
		int prod_other_player_hand_size = get_prod_other_player_hand_size(player.player_num, player.player_hand_sizes);
		
		return new double[] {
				player_num,
				hand_size,
				pile_size,
				num_hand_ranks,
				num_possible_pile_ranks,
				min_turns_min_bluffs,
				min_other_player_hand_size,
				avg_other_player_hand_size,
				prod_other_player_hand_size
		};
	}






	public static void main(String[] args) {

		ArrayList<Integer> cards = new ArrayList<>();
		cards.add(0);
		cards.add(1);
		cards.add(0);
		cards.add(1);
		cards.add(1);
		cards.add(2);
//		for (ArrayList<Integer> set : get_potential_discard_sets(cards))
//			System.out.println(set);

		int current_turn = 2;
		System.out.println(get_min_turns_min_bluffs(cards, current_turn));

}





}
