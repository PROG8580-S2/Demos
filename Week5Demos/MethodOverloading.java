import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, doubleArea;
		int intSide1, intSide2, intArea;

		System.out.print("Enter side 1: ");
		side1 = input.nextDouble();
		System.out.print("Enter side 2: ");
		side2 = input.nextDouble();

		doubleArea = area(side1, side2);
		System.out.println("area = " + doubleArea + "u^2");
		
		doubleArea = area(side1);
		System.out.println("area = " + doubleArea + "u^2");
		
		System.out.print("Enter side 1: ");
		intSide1 = input.nextInt();
		System.out.print("Enter side 2: ");
		intSide2 = input.nextInt();

		intArea = area(intSide1, intSide2);
		System.out.println("area = " + intArea + "u^2");
	}

	public static double area(double width, double length) {
		return width * length;
	}

	public static double area(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public static int area(int width, int length) {
		return width * length;
	}


}
