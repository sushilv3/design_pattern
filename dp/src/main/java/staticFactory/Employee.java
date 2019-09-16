package staticFactory;

public class Employee {
	private final String name;
	private final String city;
	private final int salary;
	private final String id;
	/*
	 * client con't no see private constructor
	 */
	private Employee(String name, String city, String id,int salary) {
		this.name = name;
		this.city = city;
		this.id = id;
		this.salary = salary;
	}
	
	public static Employee createEmployee(final String name,final String city,final String id, final int salary) {
		return new Employee(name, city, id, salary);
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", salary=" + salary + ", id=" + id + "]";
	}
	
}
