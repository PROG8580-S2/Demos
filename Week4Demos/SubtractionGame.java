import java.util.Scanner;

public class SubtractionGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int NUMBER_OF_QUESTIONS = 5;
		int num1, num2, difference, userAnswer;
		int score = 0;

		for (int i = 1; i <= NUMBER_OF_QUESTIONS; i++) {
			num1 = (int) (Math.random() * 10);
			num2 = (int) (Math.random() * 10);

			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			difference = num1 - num2;

			System.out.println(num1 + " - " + num2 + " = ? ");
			userAnswer = input.nextInt();

			if (userAnswer == difference) {
				score++;
				System.out.println("You got it!!!");
			} else {
				System.out.println("Oops. Nice try.");
			}
			
		}
		
		System.out.println("Your final score is: " + score);

	}

}
