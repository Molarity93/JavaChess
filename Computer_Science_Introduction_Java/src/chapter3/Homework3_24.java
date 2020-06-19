package chapter3;

public class Homework3_24 {

	public static void main(String[] args) {
		int n = (int) (Math.random() * 52);

		int rank = n % 13;
		int suit = n / 13;

		String rankString = "";
		String suitString = "";

		switch (rank) {
		case 0:
			rankString = "Ace";
			break;
		case 10:
			rankString = "Jack";
			break;
		case 11:
			rankString = "Queen";
			break;
		case 12:
			rankString = "King";
			break;
		default:
			rankString = "" + (rank + 1);
			break;
		}

		switch (suit) {
		case 0:
			suitString = "Clubs";
			break;
		case 1:
			suitString = "Diamonds";
			break;
		case 2:
			suitString = "Hearts";
			break;
		case 3:
			suitString = "Spades";
			break;
		}

		System.out.println("The card you picked is: " + rankString + " of " + suitString);
	}

}

/*
 * The card you picked is: 2 of Hearts
 * The card you picked is: 10 of Spades
 * The card you picked is: Ace of Clubs
 * The card you picked is: Jack of Spades
 * The card you picked is: Queen of Diamonds
 * The card you picked is: King of Diamonds
 */

