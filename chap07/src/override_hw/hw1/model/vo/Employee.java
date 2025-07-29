package override_hw.hw1.model.vo;

public class Employee extends Person {
	int salary;
	String dept;
	
	public Employee() {
	}
	
	Employee(String name, int age, double height,
			double weight, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [toString()=" + super.toString() + "]";
	}
	
}
