package sec02.exam06.quiz;

public class Staff extends SchoolMember{
	@Override
	void introduce() {
		System.out.println("안녕하세요, 직원입니다.");
	}
	
	void work() {
		System.out.println("일하는 중입니다.");
	}
}
