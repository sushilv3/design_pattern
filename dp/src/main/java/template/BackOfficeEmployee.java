package template;

public class BackOfficeEmployee extends AbsEmployee {

	private static String companyName;

	public BackOfficeEmployee(int salary, String name, String city, Designation designation) {
		super(name, city, designation, salary);
		BackOfficeEmployee.companyName = "ABC Ltd";

	}

	@Override
	public String getDetails() {
		return "";
	}

	@Override
	public void work() {

	}

	@Override
	protected int salary() {

		return salary;
	}

	@Override
	public String toString() {
		return "BackOfficeEmployee [" + super.toString() +" Company Name "+companyName+"]";
	}

	



}
