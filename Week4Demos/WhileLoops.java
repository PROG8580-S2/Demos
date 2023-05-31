import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1. show all value between 1 and 5
		int counter = 1;

		while (counter <= 5) {
			System.out.print(counter + " ");
			counter++;
		}

		// 2. Create a counting program
		System.out.println();

		boolean keepCounting = true;
		int loopCounter = 0;
		String userChoice;

		while (keepCounting) {
			System.out.println("Keep counting? (y/n)");
			userChoice = input.nextLine();

			if (userChoice.equalsIgnoreCase("y")) {
				loopCounter++;
				System.out.println(loopCounter);
			} else if (userChoice.equalsIgnoreCase("n")) {
				keepCounting = false;
			} else {
				System.out.println("Only enter y or n");
			}
		}

		System.out.println("Thanks for playing!!!");

		// 3. Create an addition game
		int num1, num2, userAnswer, sum;

		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);

		sum = num1 + num2;

		System.out.println(num1 + " + " + num2 + " = ? ");
		userAnswer = input.nextInt();

		while (userAnswer != sum) {
			System.out.println("Try again.");
			System.out.println(num1 + " + " + num2 + " = ? ");
			userAnswer = input.nextInt();
		}

		System.out.println("It's right");

	}

}
