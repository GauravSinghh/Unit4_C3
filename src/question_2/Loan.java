package question_2;

public class Loan {

	
	private Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static Loan getLoanObject() {
		Loan l1 = new Loan();
		return l1;
	}

	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof  PermanentEmployee)
		{
			double loan =(employeeObj.salary*15)/100;
			return loan;
		}
		else if(employeeObj instanceof  TemporaryEmployee)
		{
			double loan =(employeeObj.salary*10)/100;
			return loan;
		}
		else {
			return 0;
		}	
	}
}
