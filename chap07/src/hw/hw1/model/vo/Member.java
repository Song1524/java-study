package hw.hw1.model.vo;

public class Member {
	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	
	public Member() {
		memberName = "곽두팔";
	}
	
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println("변경 후 이름: " + memberName);
	}
}
