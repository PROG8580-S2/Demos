/* PayCalculator.java
 * To determine how much the user earned 
 * 
 * Revision History:
 *     Tony Theo..., 2023.03.15: Created
 */
import java.util.Scanner;

public class PayCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//variables
		String firstName;
		double hours;
		double payRate;
		double preTax;
		double taxRate = 0.24;
		double taxAmount;
		double earned;
		
		//get inputs from the user
		System.out.println("Enter your first name");
		firstName = input.nextLine();
		
		System.out.println("Enter your hours");
		hours = input.nextDouble();
		
		System.out.println("Enter your hourly wage");
		payRate = input.nextDouble();

		//calculate user overall wage (process)
		preTax = hours * payRate;
		taxAmount = preTax * taxRate;
		earned = preTax - taxAmount;
		
		//Show outputs to the screen
		System.out.println("Calculation for: " + firstName);
		System.out.println("Pre tax        : " + preTax);
		System.out.println("Tax            : " + taxAmount);
		System.out.println("Earned         : " + earned);

		
		
		
		
		
		
		
		
		
		
		
	}

}
