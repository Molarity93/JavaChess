package chapter3;

public class PracticeHomework3 {
	
	public static void cardGame2(int cards) {
		int rank = cards % 13;
		int suit = cards / 13;
		
		String rankString = "";
		String suitString = "";
		
		switch (rank) {
		case 0:
			rankString = "Ace";
			break;
		case 10:
			rankString ="Jack";
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
			suitString = "Hearts";
			break;
		case 1:
			suitString = "Diamonds";
			break;
		case 2:
			suitString = "Clubs";
			break;
		case 3:
			suitString = "Spades";
			break;
		}
		System.out.println("The card you picked is " + rankString + " of " + suitString + ".");
	}

	public static void main(String[] args) {
		
		int cards = (int) (Math.random() * 52);
		
		cardGame2(cards);

	}

}
