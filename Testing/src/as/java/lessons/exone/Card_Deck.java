package as.java.lessons.exone;

public class Card_Deck {
	public static void main(String[] args) {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack",
				"Queen", "King", "Ace" };

		String[] deck = new String[rank.length * suit.length];

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = rank[i] + " of " + suit[j];
				System.out.println(rank[i] + " of " + suit[j]);
			}
		}

	}

}
