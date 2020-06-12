import java.util.ArrayList;
import java.util.Stack;

public interface BSPlayer {

	public void start_game(ArrayList<Integer> hand, int playerNum);

	public void add_to_hand(Stack<Integer> cards);

	public ArrayList<Integer> get_play(int current_rank);

	public boolean report_play_get_call(int playing_player_num, int num_cards_played, int card_rank);

	public void report_call_result(int playing_player_num, int calling_player_num, int call_state);

}
