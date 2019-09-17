package template;

public class BackOfficeEmployee extends AbsEmployee {

	private static String companyName;

	public BackOfficeEmployee(int salary, String name, String city, Designation designation) {
		super(name, city, designation, salary);
		BackOfficeEmployee.companyName = "ABC Ltd";

	}


	@Override
	protected int salary() {

		return salary;
	}

	@Override
	public String toString() {
		return "BackOfficeEmployee [" + super.toString() +" Company Name "+companyName+"]";
	}


	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}


	public void work() {
		// TODO Auto-generated method stub
		
	}

	



}
