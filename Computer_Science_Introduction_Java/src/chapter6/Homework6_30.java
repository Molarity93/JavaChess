package chapter6;

public class Homework6_30 {

	public static int craps(int dice1, int dice2) {
		int sum;
		int newSum = 0;
		int newTemp = 0;
		boolean game = true;
		
		while (game) {
			newSum = dice1 + dice2;
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + newSum);
		}
		if ((sum == 2) || (sum == 3) || (sum ==12)) {
			game = false;
			System.out.println("You lose");
		}
		else
		if ((sum == 7) || (sum == 11)) {
			game = false;
			System.out.println("You win");
		}
		else System.out.println("point is " + sum);
		
		if (newSum == newTemp) {
			game = false;
			System.out.println("You win");
		}
		else if (newSum == 7) {
			game = false;
			System.out.println("You lose");
		}
		else {
			newTemp = newSum;
			System.out.println("point" + newTemp);
		}
	}

	public static void main(String[] args) {

		int dice1, dice2;
		
		dice1 = (int) (Math.random() * 6 + 1);
		dice2 = (int) (Math.random() * 6 + 1);

		System.out.println(craps(dice1, dice2));

	}
}
