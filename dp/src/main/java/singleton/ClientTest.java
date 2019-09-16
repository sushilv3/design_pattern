package singleton;

public class ClientTest {

	public static void main(String[] args) {
		
		Employee e = Employee.createEmployee();
		
		Employee e1 = Employee.createEmployee();
		
		System.out.println(e==e1);
		
				
		System.out.println(System.identityHashCode(e) +" : "+e);
		System.out.println(System.identityHashCode(e1)+" : "+e1);
			
	}

}
