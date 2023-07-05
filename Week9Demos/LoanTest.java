
public class LoanTest {

	public static void main(String[] args) {
		// Create a loan object at 5%, 6 years, $20000
		Loan loan1 = new Loan(7.99, 7, 39600);
		
		// Display date, monthly payment, and total payment
		System.out.println("Date: " + loan1.getLoanDate());
		System.out.printf("Monthly: $%.2f", loan1.getMonthlyPayment());
		System.out.printf("\nTotal: $%.2f", loan1.getTotalPayment());
		
		// Create a default, (no-arg), loan object 
		Loan loan2 = new Loan();
		
		// Set the loan amount to 10000
		loan2.setLoanAmount(750000);
		
		// Set the rate to 7.95%
		loan2.setAnnualInterestRate(4.00);
		
		// Set the years to 7
		loan2.setNumberOfYears(25);
		
		System.out.println("\n");
		System.out.println("Date: " + loan2.getLoanDate());
		System.out.printf("Monthly: $%.2f", loan2.getMonthlyPayment());
		System.out.printf("\nTotal: $%.2f", loan2.getTotalPayment());
	
	}

}
