package singleton;

public class Employee {

	
	private static Employee employee;
	/*
	 * client con't no see private constructor
	 */
	private Employee() {
	
	}
	
	public static Employee createEmployee() {
		if(employee == null)
		{
		employee =  new Employee();
		}
		return employee;
	}
}
