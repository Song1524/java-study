package hw.hw1;

public class Person {
	
	String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
	
	private String name;
	private int age;
	private String address;
	private char gender;
	
	public Person() {
	}

	public Person(String name, int age, String address, char gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + getName() + ", age=" + getAge() + ", address=" + 
				getAddress() + ", gender=" + getGender() + "]";
	}
	
}
