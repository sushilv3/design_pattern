package template;

public class ClientEmp {

	public static void main(String[] args) {

	IEmployee be = new BackOfficeEmployee(20000, "Rakesh","Delhi",Designation.DEVELOPER);
	System.out.println("BackOffice Employee monthly Salary  : " +be.monthlysalary());
	System.out.println("!!!!!!!!!! : "+be);
	
	IEmployee me = new MarketingEmployee(20000, "Ramesh","Kanpur", 3,Designation.MARKETING_CONSULTANT);
	System.out.println("Marketing Employee monthly Salary  : " +me.monthlysalary());
	
	System.out.println("Marketing Employee  : " +me);

	}

}
