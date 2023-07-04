
public class Circle {
	public double radius;

	// no-arg or default constructor
	public Circle() {
		radius = 1;
	}
	
	//non-default constructor
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
}
