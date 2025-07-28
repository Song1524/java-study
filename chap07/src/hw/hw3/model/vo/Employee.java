package hw.hw3.model.vo;

public class Employee {
	int empNO;
	String empName;
	String dept;
	String job;
	int age;
	char gender;
	int salary;
	double bonus;
	String phone;
	String address;
	
	public Employee() {

	}
	
	public Employee(int empNO, String empName) {

	}
	
	public Employee(int empNO, String empName, String dept, 
					String job, int age, char gender, int salary, 
					double bonus, String phone, String address) {
		
	}

	public int getEmpNO() {
		return empNO;
	}

	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String Employee() {
		return empNO + empName + getDept() + getJob() + getAge() + getGender() + 
			   getSalary() + getBonus() + getPhone() + getAddress();
		
//		System.out.println("=== " + empName + " ===");
	}

	
}
