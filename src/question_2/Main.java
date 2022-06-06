package question_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	try {
		Scanner scan = new Scanner(System.in);
		Loan l1 = Loan.getLoanObject();
		
		System.out.println("Enter permanent Employee details");
		System.out.println("Enter Permanent Employee Name");
		String pName  = scan.next();
		
		System.out.println("Enter Permanent Employee id");
		int pId = scan.nextInt();
		
		System.out.println("Enter permanent employee basic Pay");
		double pBasicPay = scan.nextDouble();
		
		
		PermanentEmployee p1 = new PermanentEmployee(pId, pName, pBasicPay);
		p1.calculateSalary();
		double loan =l1.calculateLoanAmount(p1);
		
		System.out.println("Permanent employee name : "+	p1.getEmployeeName());
		System.out.println("Permanent employee ID : "+	p1.getEmployeeId());
		System.out.println("Permanent employee Salary : "+	p1.getSalary());
		System.out.println("Permanent employee loan : "+ loan);
		
		System.out.println("-----------------------");
		System.out.println("Enter Temporary Employee Details");
		System.out.println("Enter Temporary Employee Name");
		String tName  = scan.next();
		
		System.out.println("Enter Temporary Employee id");
		int tId = scan.nextInt();
		
		System.out.println("Enter Temporary Employee hours worked");
		int tHours = scan.nextInt();
		
		System.out.println("Enter Temporary Employee HOurly wages");
		int tWages = scan.nextInt();
		
		TemporaryEmployee t1 = new TemporaryEmployee(tId, tName, tHours, tWages);
		t1.calculateSalary();
		
		double loan1 =l1.calculateLoanAmount(t1);
		System.out.println("Temporary employee name : "+	t1.getEmployeeName());
		System.out.println("Temporary employee ID : "+	t1.getEmployeeId());
		System.out.println("Temporary employee Salary : "+	t1.getSalary());
		System.out.println("Temporary employee loan : "+ loan1);
		
		double nLoan =l1.calculateLoanAmount(null);
		System.out.println(nLoan);
	}catch(Exception e) {
		System.out.println(e);
	}
		
	}

}
