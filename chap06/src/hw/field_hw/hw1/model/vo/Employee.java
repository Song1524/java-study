package hw.field_hw.hw1.model.vo;

public class Employee {
	public String name;			// 외부 패키지에서 수정, 접근 가능
	public String team;			// 외부 패키지에서 수정, 접근 가능
	private String position;	// 내부 패키지에서만 수정, 접근 가능
	private int money;			// 내부 패키지에서만 수정, 접근 가능
	private int bonus;			// 클래스 내부에서만 수정, 접근 가능
	
	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
	}
	
	
}
