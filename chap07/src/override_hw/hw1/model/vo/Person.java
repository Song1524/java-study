package override_hw.hw1.model.vo;

public class Person {
	String name;
	int age;
	double height;
	double weight;

	public Person() {
	}
	
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
