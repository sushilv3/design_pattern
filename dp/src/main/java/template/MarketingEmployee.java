package template;

public class MarketingEmployee extends AbsEmployee {

	private final int noOfClient;
	private static String companyName;

	public MarketingEmployee(int salary, String name, String city, int noOfClient, Designation designation) {
		super(name, city, designation, salary);
		this.noOfClient = noOfClient;
		MarketingEmployee.companyName = "ABC Ltd";
	}


	
	@Override
	protected int salary() {
		int commission = 1000;
		return this.salary + (this.noOfClient * commission);
	}

	@Override
	public String toString() {
		return "BackOfficeEmployee [" + super.toString() + " Company Name " + companyName + "]";
	}

	public String getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	public void work() {
		// TODO Auto-generated method stub
		
	}
}
