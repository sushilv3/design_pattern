package builder;

public class Test {

	public static void main(String[] args) {
		
		
		User u1 = new User().firstName("Sushil").lastName("Vernma");
		System.out.println("User1 : "+u1);
		
		User u2 = new User().firstName("Sushil").lastName("Vernma").age(20);
		System.out.println("User1 : "+u2);
		
		User u3 = new User().firstName("Sushil").lastName("Vernma").age(20).address("lko").id("001").contact("9044454545");
		System.out.println("User1 : "+u3);

	}

}
