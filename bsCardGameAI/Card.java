import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Card {

	static int NUM_RANKS = 13;
	static int NUM_CARDS = 52;
	static String RANKS = "A23456789TJQK";
	static Integer ACE = 0;


	public static Stack<Integer> get_shuffled_deck(long seed) {
		Stack<Integer> deck = new Stack<>();
		for (int i = 0; i < NUM_CARDS; i++) {
			deck.push(i % NUM_RANKS);
		}
		Collections.shuffle(deck, new Random(seed));
		return deck;
	}

	public static String string(int r) {
		return (RANKS.charAt(r) + "");
	}

	public static String string(int[] cards) {
		ArrayList<Integer> cardsAL = new ArrayList<>();
		for (int i = 0; i < cards.length; i++) {
			cardsAL.add(cards[i]);
		}
		return string(cardsAL);
	}

	
	public static String string(List<Integer> list) {
		Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for (int r : list) {
			sb.append(string(r) + " ");
		}
		String out = sb.toString();
		return "[" + (out.length() > 1 ? out.substring(0, out.length() - 1) : "") + "]";
	}




	public static void main(String[] args) {
		ArrayList<Integer> cards = new ArrayList<>();
		System.out.println(string(cards));
		for (int i = 0; i < NUM_CARDS; i += 3) {
			cards.add(i % 13);
		}
		System.out.println(string(cards));
		System.out.println(string(get_shuffled_deck(0)));
	}


}
