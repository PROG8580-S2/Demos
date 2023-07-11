
public class CourseTest {

	public static void main(String[] args) {
		Course c1 = new Course("PROG8850");
		c1.addStudent(new Student("Tony", 1001));
		c1.addStudent(new Student("Ari", 1002));
		c1.addStudent(new Student("Steph", 1003));
		c1.addStudent(new Student("Dave", 1003));

		System.out.println("# of students: " + c1.getNumberOfStudents());
		
		Student[] classlist = c1.getStudents();
		
		for (int i = 0; i <= c1.getNumberOfStudents(); i ++) {
			System.out.println(classlist[i].getStudentNumber() + 
					" " + classlist[i].getName());
		}
		
		System.out.println("end of program");
	}
}
