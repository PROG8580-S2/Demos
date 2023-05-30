
public class CharValues {

	public static void main(String[] args) {
		char c = 112;
		int i = 'a';
		
		System.out.println(c);
		System.out.println(i);
		
		c++;
		System.out.println(c);

		if (c >= 'A' && c <= 'Z') {
			System.out.println(c + " is an uppercase letter.");
		} else if (c >= 'a' && c <= 'z') {
			System.out.println(c + " is a lowercase letter.");
		}else if (c >= '0' && c <= '9') {
			System.out.println(c + " is a number");
		}
		


	}

}
