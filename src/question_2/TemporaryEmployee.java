package question_2;

public class TemporaryEmployee extends Employee{

	private int hoursWorked;
	private int hourlyWages;
	
	
	public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}

	

	public TemporaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public TemporaryEmployee(int employeeId, String employeeName) {
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}



	@Override
	void calculateSalary() {
	    	double sal = hoursWorked*hourlyWages;
				//Set this value to the salary attribute.
		setSalary(sal);
	}
	
	
	
}
