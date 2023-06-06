import java.util.Scanner;

public class MethodExamples {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.println("1");
//		printName();
//		System.out.println("2");
//
//		add();
		maxValue();
	}

	public static void printName() {
		System.out.println("Your's truly\nGrace Hopper");
	}

	public static void add() {
		int num1, num2, sum;

		System.out.print("Enter number: ");
		num1 = input.nextInt();

		System.out.print("Enter number: ");
		num2 = input.nextInt();

		sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

	// find the max of the 3 ints entered by the user
	public static void maxValue() {
		int num1, num2, num3, max;

		num1 = 4;
		num2 = 3;
		num3 = 5;

		long startTime = System.currentTimeMillis();
		long endTime, testTime;

		for (int i = 0; i < 1000000000; i++) {
			for (int j = 0; j < 1000000000; j++) {

				max = num1;

				if (num2 > max) {
					max = num2;
				}

				if (num3 > max) {
					max = num3;
				}

			}
		}

		endTime = System.currentTimeMillis();
		testTime = endTime - startTime;
		System.out.println(testTime);
	}

}
