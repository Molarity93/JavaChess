package chapter6;

import java.util.*;

public class Homework6_30 {

	public static int obtain_Dice() {
		int dice1 = (int) (Math.random() * 6 + 1);
		int dice2 = (int) (Math.random() * 6 + 1);

		int dieRoll = dice1 + dice2;
		System.out.println("You rolled: " + dice1 + " and " + dice2 + " = " + dieRoll);
		return dieRoll;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.close();

		int diceRoll = 0;
		int point = 0;

		while (point < 2) {

			diceRoll = obtain_Dice();

			if (diceRoll == 7 || diceRoll == 11) {
				System.out.println("You win from a roll of " + diceRoll);
				break;
			} else if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
				System.out.println("You lose from a roll of " + diceRoll);
				break;
			} else {
				System.out.println("point is: " + point);
				point++;
				if (point == 2)
					System.out.println("You win from a roll of " + diceRoll);
				else {
					input.reset();
				}
			}
		}
	}
}
