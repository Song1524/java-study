package hw.hw4.controller;

import hw.hw4.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person person = new Person();
//		System.out.println(person.name + "는 " + person.age + "살 입니다.");
		
		person.setName("김철수");
		person.setAge(20);
		
		System.out.println(person.getName() + "는 " + person.getAge() + "살 입니다.");
	}

}
