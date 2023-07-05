import java.util.*;

public class ClassTest {

	public static void main(String[] args) {
//		circleTest();
//		TVTest();
//		CarTest();
		CalculatorTest();
	}
	
	public static void circleTest() {
		// create circle with default constructor
		Circle circle1 = new Circle();
		
		System.out.println("\nCircle1 ");
		System.out.println("radius: " + circle1.radius);
		System.out.println("area: " + circle1.getArea());
		
		//create a circle with non-default constructor
		Circle circle2 = new Circle(10);
		
		System.out.println("\nCircle2 ");
		System.out.println("radius: " + circle2.radius);
		System.out.println("area: " + circle2.getArea());
	
		//modify circle1 and display again 
		circle1.radius = 150;
		
		System.out.println("\nCircle1 ");
		System.out.println("radius: " + circle1.radius);
		System.out.println("area: " + circle1.getArea());
		
		
	}

	public static void TVTest() {

		TV tv = new TV();
		
		tv.turnOn();
		tv.volumeDown();
		
		tv.turnOff();
		tv.volumeDown();
		tv.volumeDown();
		
		tv.turnOn();
		tv.volumeDown();
		tv.volumeDown();
		
		System.out.println("Power: " + tv.on);
		System.out.println("Channel: " + tv.channel);
		System.out.println("Volume: " + tv.volumeLevel);

	}
	
	public static void CarTest() {
		Scanner input = new Scanner(System.in);
		int year;
		String make;
		int mileage;
		double price;
		
		//Show how the car will have default values in fields
		Car c1 = new Car();
		
		displayCar(c1);
		
		// Create two cars with pre-defined values
		Car c2 = new Car(2020, "Honda", 23000, 30000);
		Car c3 = new Car(2018, "Ferrari", 20000, 3000000);
		
		displayCar(c2);
		displayCar(c3);
		System.out.println(Car.numberOfCars);
		
		System.out.print("Enter year: ");
		year = input.nextInt();
		
		System.out.print("Enter make: ");
		make = input.next();
		
		System.out.print("Enter mileage: ");
		mileage = input.nextInt();
		
		System.out.print("Enter price: ");
		price = input.nextDouble();
		
		Car c4 = new Car(year, make, mileage, price);
		displayCar(c4);
		
        //update mileage on car 2 and re-display
		c2.setMileage(24000);
		displayCar(c2);
		System.out.println(Car.numberOfCars);

	}
	
	public static void displayCar(Car c) {
		System.out.println(c.getYear() + " " +
				c.getMake() + " - " +
				c.getMileage() + "km - $" +
				c.getPrice());
	}

	public static void CalculatorTest() {
		int answer = Calculator.add(4,3);
		System.out.println(answer);
		
		answer = Calculator.subtract(5,9);
		System.out.println(answer);

	}
}
