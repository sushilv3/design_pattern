package builder;

public class User {
	public String firstName;
	public String lastName;
	public String contact;
	public String address;
	public String id;
	public int age;

	public User() {
		
	}
	public User(String firstName, String lastName, int age, String address, String contact, String id) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.contact = contact;
		this.id = id;
	}
	public User firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	
	public User lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public User age(int age) {
		this.age = age;
		return this;
	}
	public User address(String address) {
		this.address = address;
		return this;
	}
	public User contact(String contact) {
		this.contact = contact;
		return this;
	}
	
	public User id(String id) {
		this.id = id;
		return this;
	}
	
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", address="
				+ address + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
}
