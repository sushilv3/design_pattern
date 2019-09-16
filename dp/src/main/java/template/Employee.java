package template;

public class Employee {

	private final String name;
	private final String city;
	private final int salary;
	private final int noOfClient;
	
	public Employee(String name, String city, int salary, int noOfClient) {
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.noOfClient = noOfClient;
				
	}

	final int mSalaryWithCommision() {
		int allowance = 1000;
		final int commission = 1000;
		return allowance+this.salary+(this.noOfClient*commission);
		
	}
}
