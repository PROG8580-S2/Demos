
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {

		this.name = name;
		setAge(age);

	}

	public void setAge(int age) {
		if (age < 0 || age > 120) {
			throw new InvalidAgeException("out of range");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
