
public class ClassTest {

	public static void main(String[] args) {
//		circleTest();
		TVTest();
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
}
