import java.util.Scanner;

public class SearchCompare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String testString, testString2, firstName, lastName;
		int index, compareValue;

		System.out.println("Enter course code");
		testString = input.nextLine();

		System.out.println(testString.length());
		System.out.println(testString.charAt(testString.length() - 1));

		if (testString.contains("PROG")) {
			System.out.println("Programming class");
		} else {
			System.out.println("Not programming class");
		}

		index = testString.indexOf('p');

		if (index >= 0) {
			System.out.println(index);
		} else {
			System.out.println("Not found");
		}

		testString = "xx oo xx oo xx";

		index = testString.indexOf("xx");
		System.out.println(index);

		// second parameter is index where search starts
		index = testString.indexOf("xx", 1);
		System.out.println(index);

		index = testString.lastIndexOf("xx");
		System.out.println(index);

		testString = "Tonyyy Theodor";
		index = testString.indexOf(" ");

		firstName = testString.substring(0, index);
		System.out.println(firstName);

		lastName = testString.substring(index + 1);
		System.out.println(lastName);

		// 3. Compare two strings
		testString = "waterloo";
		testString2 = "Waterloo";

		if (testString.equalsIgnoreCase(testString2)) {
			System.out.println("Same city");
		} else {
			System.out.println("Different city");
		}

		compareValue = testString2.compareTo(testString);
		System.out.println(compareValue);

		if (compareValue == 0) {
			System.out.println("same city");
		} else if (compareValue < 0) {
			System.out.println(testString2 + " " + testString);
		} else {
			System.out.println(testString + " " + testString2);
		}
			
		
		
		
		input.close();
	}

}
