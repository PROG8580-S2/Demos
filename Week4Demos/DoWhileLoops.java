import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// 1. show all value between 1 and 5
		int counter = 1;

		do {
			System.out.print(counter + " ");
			counter++;
		} while (counter <= 5);

		// 2. Create a menu system
		System.out.println();

		String choice;
		int length, width, area;

		do {
			System.out.println("Please select an option");
			System.out.println("1. Display numbers 1-5");
			System.out.println("2. Find area of rectangle");
			System.out.println("3. Exit");
			choice = input.next();

			if (choice.equals("1")) {
				for (int i = 1; i <= 5; i++) {
					System.out.print(i + " ");
				}
			} else if (choice.equals("2")) {
				System.out.println("Enter length");
				length = input.nextInt();
				
				System.out.println("Enter width");
				width = input.nextInt();
				
				area = length * width;
				
				System.out.println("area = " + area + "units^2");
			}
			
			System.out.println();

		} while (!choice.equals("3"));

	}

}
