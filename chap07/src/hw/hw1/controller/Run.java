package hw.hw1.controller;

import hw.hw1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member member = new Member();
		
		System.out.println("변경 전 이름: " + member.memberName);
		
		member.changeName("송진영");
		
		member.printName();
	}

}
