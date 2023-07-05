
public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(1);
		
		// Show values from Circle Class
		System.out.println("Radius: " + c1.getRadius());
		System.out.println("Area: " + c1.getArea());
		System.out.println("Diameter: " + c1.getDiameter());

		System.out.println();
		c1.printCircle();
		
		c1.setFilled(true);
		// Get values from GeometricObject Class
		System.out.println("Color: " + c1.getColor());
		System.out.println("Filled: " + c1.isFilled());
		
		Rectangle r1 = new Rectangle(3, 4);
		System.out.println("Area: " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());
		
		c1.setCreatedBy("Tony");
		r1.setCreatedBy("Ari");
		
		System.out.println("Circle creator: " + c1.getCreatedBy());
		System.out.println("Rect. creator: " + r1.getCreatedBy());
		
		
	}

}
