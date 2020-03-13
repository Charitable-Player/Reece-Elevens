/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static String[] ranks = {"king, queen, jack"};
	public static String[] suits = {"Spades,hearts,diamonds"};
	public static int[] values = {11, 12, 13};

	public static void main(String[] args) {
		Deck one = new Deck(ranks ,suits,values );
		one.deal();
		System.out.println(one);

	}
}
