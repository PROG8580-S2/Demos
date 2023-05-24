
public class MathMethods {

	public static void main(String[] args) {
		double randDouble, total, tipRate, tipAmount;
		int randInt, min, max;

		//1. Get a random values in a range
		randDouble = Math.random() * 10;
		System.out.println(randDouble);
		
		randInt = (int)(Math.random() * 10);
		System.out.println(randInt);
		
		min = 10;
		max = 13;
		
		randInt = (int)(Math.random() * (max - min + 1) + min);
		System.out.println(randInt);

	    //2. round a decimal value
		randDouble = 2.5;
		
		System.out.println(Math.ceil(randDouble));
		System.out.println(Math.floor(randDouble));
		System.out.println(Math.round(randDouble));
		System.out.println(Math.rint(randDouble));
		System.out.println(randDouble);

		randDouble = Math.floor(randDouble);
		System.out.println(randDouble);
		
		//3. get the max and min values
		System.out.println(Math.max(min, max));
		System.out.println(Math.min(3, 4));

	    //4. get the absolute value 
		System.out.println(Math.abs(-4.3));
		
	    //5. use power and square root
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(16));
		
	    //6. calculate the tip on a bill and 
		//   format output with specifier

		total = 67.45;
		tipRate = 0.15;
		tipAmount = total * tipRate;
		
		System.out.println("tip:   $" + tipAmount);
		System.out.printf("tip:   $%.2f\n", tipAmount);
		System.out.printf("total: $%.2f   tip:   $%.2f", total, tipAmount);

		
		 //7. create a table of values
	    System.out.println();
	    System.out.printf("\n%-10s%-10s%-10s", "x", "x^2", "x^3");
	    System.out.printf("\n%-10.0f%-10.2f%-10.0f", 1.0, Math.pow(1, 2), Math.pow(1, 3));
	    System.out.printf("\n%-10d%-10.0f%-10.0f", 2, Math.pow(2, 2), Math.pow(2, 3));
	    System.out.printf("\n%-10.0f%-10.0f%-10.4f", 3.0, Math.pow(3, 2), Math.pow(3, 3));
	   
	}

}
