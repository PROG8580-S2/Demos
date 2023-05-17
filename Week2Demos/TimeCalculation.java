import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//variables
		int seconds, minutes, remainingSeconds;
		
		//get total seconds from the user
		System.out.println("Enter seconds");
		seconds = input.nextInt();
		
		//Find minutes in total seconds
		minutes = seconds / 60;
		
		System.out.println(minutes + " minutes");
		
		//Find the remaining seconds
		remainingSeconds = seconds % 60;
		System.out.println(remainingSeconds + " seconds");

	}

}
