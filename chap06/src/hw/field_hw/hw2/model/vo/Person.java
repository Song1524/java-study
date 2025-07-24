package hw.field_hw.hw2.model.vo;

public class Person {
	private String name;			// 내부에서만 활용 가능
	private String address;			// 내부에서만 활용 가능
	public String ponNum;			// 외부 패키지에서 활용 가능
	public double height;			// 외부 패키지에서 활용 가능
	public double weight;			// 외부 패키지에서 활용 가능
	
	public Person(String ponNum, double height, double weight) {
		this.ponNum = ponNum;
		this.height = height;
		this.weight = weight;
	}
	
}
