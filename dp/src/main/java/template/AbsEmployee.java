package template;

import java.lang.annotation.Native;

public abstract class AbsEmployee implements IEmployee {

	private final String name;
	private final String city;
	private final Designation designation;
	protected final int salary;

	public AbsEmployee(final String name, final String city,final Designation designation,final int salary) {
		this.name = name;
		this.city = city;
		this.designation = designation;
		this.salary = salary;
	}

	final public int monthlysalary() {
		int allowances = 1000;
		int s = salary();
		return s + allowances;
	}

	protected abstract int salary();

	@Override
	public String toString() {
		return "AbsEmployee [name=" + name + ", city=" + city + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}

}
