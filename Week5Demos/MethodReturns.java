import java.util.Scanner;

public class MethodReturns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1, num2, answer, copies;
		double side1, side2, area;

		System.out.print("Enter num1: ");
		num1 = input.nextInt();
		System.out.print("Enter num2: ");
		num2 = input.nextInt();

		System.out.println(add(num1, num2));

		answer = add(num1, num2);

		System.out.println(num1 + " + " + num2 + " = " + answer);

		System.out.print("Enter side 1: ");
		side1 = input.nextDouble();
		System.out.print("Enter side 2: ");
		side2 = input.nextDouble();

		area = areaRectangle(side1, side2);
		System.out.println("area = " + area + "u^2");

		copies = 101;
		System.out.println(copies);
		System.out.println(printPrice(copies));
	}

	public static int add(int x, int y) {
		int sum;
		sum = x + y;

		return sum;
	}

	public static double areaRectangle(double width, double length) {
		return width * length;
	}

	// A method that determines price for printing based on copies made
	//
	// 0 - 10 prints: $1.00/print
	// 11 - 50 prints: $0.75/print
	// 51 - 100 prints: $0.65/print
	// 101 or over: $0.50/print
	public static double printPrice(int copies) {
		double pricePerCopy;

		if (copies <= 10) {
			pricePerCopy = 1.00;
		} else if (copies <= 50) {
			pricePerCopy = .75;
		} else if (copies <= 100) {
			pricePerCopy = .65;
		} else {
			pricePerCopy = .50;
		}

		return pricePerCopy * copies;
	}

}
