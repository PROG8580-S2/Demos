import java.util.Scanner;
public class MethodParameters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username, userPin;
//		int num1, num2;
//		
//		System.out.print("Enter number: ");
//		num1 = input.nextInt();
//
//		System.out.print("Enter number: ");
//		num2 = input.nextInt();
//		
//		add(num1, num2);
//		
//		canVote(1);
		
//		System.out.println("Enter name: ");
//		username = input.nextLine();
//		
//		System.out.println("Enter PIN: ");
//		userPin = input.nextLine();
//		
//		userCheck(username, userPin);
		
		inchesToCm(2.45);
	}

	public static void add(int x, int y) {
		int sum;

		sum = x + y;
		System.out.println(x + " + " + y + " = " + sum);
	}
	
	public static void canVote(int age) {
		if (age >= 18) {
			System.out.println("you can vote");
		}
		else {
			System.out.println("you can't vote");
		}			
	}
	
	// welcome a user by name that enters the pin 1234
	public static void userCheck(String name, String pin) {
		if(pin.equals("1234")) {
			System.out.println("Welcome " + name);
		}
		else {
			System.out.println("Unauthorized. Calling Security");
		}
			
	}
	
	//convert inches to cm (1inch = 2.54cm)
	public static void inchesToCm(double inches) {
		double cm;
		cm = inches * 2.54;
		
		System.out.println("conversion is " + cm + "cms" );
		
	}
	
	
	
	
	
	
}
