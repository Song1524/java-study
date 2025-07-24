package hw.field_hw.hw2.controller;

import hw.field_hw.hw2.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		Person per1 = new Person("010-0000-0000", 183.6, 78.6); 
		Person per2 = new Person("010-1111-1111", 163.1, 51.3);
		
		System.out.println("전화번호: " + per1.ponNum + " 키: " + per1.height + " 몸무게: " + per1.weight);
		System.out.println("전화번호: " + per2.ponNum + " 키: " + per2.height + " 몸무게: " + per2.weight);
	}
	
	
}	
