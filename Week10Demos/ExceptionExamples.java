import java.util.*;

public class ExceptionExamples {
	public static Scanner input = new Scanner(System.in);
	public static int id;
	public static int pin;

	public static void main(String[] args) {
//		tryCatchExamples();
//		MethodExceptions();
		MethodExceptions2();
	}

	public static void tryCatchExamples() {
		int number1, number2, answer;

		try {
			System.out.println("Enter an integer (1-100)");
			number1 = input.nextInt();

			if (number1 < 0 || number1 > 100) {
				throw new Exception("out of range");
			}

			System.out.println("Enter an integer (1-100)");
			number2 = input.nextInt();

			if (number2 < 0 || number2 > 100) {
				throw new Exception("out of range");
			}

			answer = number1 / number2;
			System.out.println(answer);
		} catch (InputMismatchException ex) {
			System.out.println("Input not an integer");
		} catch (ArithmeticException ex) {
			System.out.println("Can't divide by 0");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("End of program");
		}
	}

	public static void MethodExceptions() {
		try {
			Person person = new Person("Tony", -88);

			System.out.println("Name: " + person.getName());
			System.out.println("Age: " + person.getAge());
		} catch (InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static void MethodExceptions2() {
		try {
			System.out.print("Enter ID: ");
			id = input.nextInt();

			idCheck(id);

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("Login failed");
			
			pin = 0;
			id = 0;
		} 

		System.out.println("ID: " + id);
		System.out.println("PIN: " + pin);
	}

	public static void idCheck(int userID) throws Exception{
		if (userID != 11) {
			throw new Exception("Invalid id");
		} else {
			System.out.println("ID ok");
			System.out.print("Enter PIN: ");
			pin = input.nextInt();
			
			pinCheck(pin);
		}

		System.out.println("ID check complete");

	}
	
	public static void pinCheck(int userPin) throws Exception{
		if (userPin != 1234) {
			throw new Exception("Invalid pin");
		} else {
			System.out.println("PIN ok");

		}

		System.out.println("pin check complete");
	}
}
