import java.util.Date;

public class Car {
	private int year;
	private String make;
	private int mileage;
	private double price;
	private Date dateCreated;
	
	public static int numberOfCars = 0;

	// default or no-org constructor
	public Car() {
		dateCreated = new Date();
		numberOfCars++;
	}

	public Car(int year, String make, int mileage, double price) {
		this.year = year;
		this.make = make;
		this.mileage = mileage;
		this.price = price;
		dateCreated = new Date();
		numberOfCars++;

	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Date getDate() {
		return dateCreated;
	}

}
