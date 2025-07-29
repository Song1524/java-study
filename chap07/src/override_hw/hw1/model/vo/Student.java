package override_hw.hw1.model.vo;

public class Student extends Person {
	int grade;
	String major;
	
	public Student() {
	}
	
	public Student(String name, int age, double height,
			double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		return "=== " + name+ " ===\n" + 
				"나이 :"  + age + 
				"\n키 :"  + height + 
				"\n몸무게 :" + weight +
				"\n학년 :" + grade +
				"\n전공 :" + major;
	}
	
	
}
