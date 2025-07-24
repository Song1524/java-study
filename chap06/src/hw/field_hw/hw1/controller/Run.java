package hw.field_hw.hw1.controller;

import hw.field_hw.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp1 = new Employee("김철수", "교육운영팀");
		Employee emp2 = new Employee("이영희", "경영지원팀");
		
		System.out.println("이름: " + emp1.name + " 팀: " + emp1.team);
		System.out.println("이름: " + emp2.name + " 팀: " + emp2.team);
	}

}
