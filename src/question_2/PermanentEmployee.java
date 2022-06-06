package question_2;

public class PermanentEmployee extends Employee{

	private double basicPay;
	
	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
	}



	@Override
	void calculateSalary() {
		double pf = basicPay * 0.12;
		double sal = basicPay-pf;
	    setSalary(sal);	
	    System.out.println(getSalary());
	}



	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
