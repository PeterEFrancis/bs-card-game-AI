import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Card {

	static int NUM_RANKS = 13;
	static int NUM_CARDS = 52;
	static int ACE_OF_SPACES = 0;
	static String RANKS = "A23456789TJQK";	
	static String SUITS = "SHCD";
	
	
	public static Stack<Integer> get_shuffled_deck(long seed) {
		Stack<Integer> deck = new Stack<>();
		for (int i = 0; i < NUM_CARDS; i++) {
			deck.push(i);
		}
		Collections.shuffle(deck, new Random(seed));
		return deck;
	}
	
	public static int rank_of(int c) {
		return c % NUM_RANKS;
	}
	
	public static int suit_of(int c) {
		return Math.floorDiv(c, NUM_RANKS);
	}
	
	public static String string(int c) {
		return (RANKS.charAt(rank_of(c)) + "") + (SUITS.charAt(suit_of(c)) + "");
	}
	
	public static String string(int[] cards) {
		ArrayList<Integer> cardsAL = new ArrayList<>();
		for (int i = 0; i < cards.length; i++) {
			cardsAL.add(cards[i]);
		}
		return string(cardsAL);
	}
	
	public static String string(Iterable<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for (int c : list) {
			sb.append(string(c) + " ");
		}
		String out = sb.toString();
		return "[" + (out.length() > 1 ? out.substring(0, out.length() - 1) : "") + "]";
	}
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> cards = new ArrayList<>();
		System.out.println(string(cards));
		for (int i = 0; i < NUM_CARDS; i += 3) {
			cards.add(i);
		}
		System.out.println(string(cards));
		System.out.println(string(get_shuffled_deck(0)));
	}
	
	
}
