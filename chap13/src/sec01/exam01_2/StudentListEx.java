package sec01.exam01_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentListEx {

	public static void main(String[] args) {
		// 타입 파라미터로 사용자 정의 객체를 사용할 경우
		List<Student> studentList = new ArrayList<Student>();
		
		Student student1 = new Student("송진영", 24);
		Student student2 = new Student("김첨지", 20);
		Student student3 = new Student("홍길동", 28);
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		// 객체 검색
		// 사용자 정의 객체를 사용할 경우 indexOf(), contains()가 
		// 해당 객체 존재 여부를 판단하는 기준은 equals()
		// equals() 메소드를 재정의(오버라이딩) 해야 동등 객체로 판단
		if (studentList.indexOf(student1) != -1) {
			System.out.println("indexOf: 있다");
		} else {
			System.out.println("indexOf: 없다");
		}
		
		if (studentList.contains(student1)) {
			System.out.println("contains: 있다");
		} else {
			System.out.println("contains: 없다");
		}
		
		// 이렇게도 가능, 그런데 이렇게 하면 재정의가 필수
		// studentList.add(new Student("송진영", 24)); 와
		// studentList.indexOf(new Student("송진영", 24))는 같은 값을 가지지만 서로 다른 객체이기 때문
		// 값이 같은 객체를 두번 선언한 것
		// 하지만 이 방식이 실무에서는 더 많이 쓰임(직관적, 유지보수)
		
//		studentList.add(new Student("송진영", 24));
//		studentList.add(new Student("김첨지", 20));
//		studentList.add(new Student("홍길동", 28));
		
//		if (studentList.indexOf(new Student("송진영", 24)) != -1) {
//			System.out.println("indexOf: 있다.");
//		} else {
//			System.out.println("indexOf: 없다.");			
//		}
//		
//		if (studentList.contains(new Student("송진영", 24))) {
//			System.out.println("contains: 있다.");
//		} else {
//			System.out.println("contains: 없다.");			
//		}
		
		
		// 요소 정렬
		// Integer, String과 같은 경우 Collections.sort() 바로 사용 가능
		// Student처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// 예: name을 기준으로 정렬할 것인가, age를 기준으로 정렬할 것인가
		
		// Comparator와 Comparable 2가지 방법
		// 객체 정렬에 필요한 메소드(정렬 기준 제공)를 정의한 인터페이스		
		// Comparable은 객체의 기본 정렬 기준을 정의할 때 사용
		// Comparator는 기본 정렬 기준 외에 다른 기준이 필요할 때 사용
		
		// 실습: Student 클래스가 Comparable을 구현
		
		// sort()는 두 대상을 비교하여 자리 바꿈을 반복함
		Collections.sort(studentList);	// 재정의한 compareTo() 기준으로 정렬
		System.out.println("나이 기준 기본 정렬");
		for (Student s : studentList) {
			System.out.println(s.getName() + " - " + s.getAge());
		}
		
	}

}
