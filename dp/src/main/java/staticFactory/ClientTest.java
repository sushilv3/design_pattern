package staticFactory;

public class ClientTest {

	public static void main(String[] args) {
		Employee e = Employee.createEmployee("sushil", "lucknow", "10", 40000);
		
		System.out.println("Employee : "+e);

	}

}
