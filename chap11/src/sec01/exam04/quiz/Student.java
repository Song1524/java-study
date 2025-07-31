package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student student = (Student) obj;
//			if (studentNo == student.studentNo && name.equals(student.name)) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		// Early Return Pattern
//		if (this == obj) return true;	// 같음 참조이면 true
//		if (!(obj instanceof Student)) return false;	// Student 타입의 인스터스가 아니면 false
//			
//		Student student = (Student) obj;
//		return studentNo == student.studentNo && name.equals(student.name);
//	}
//	
//	
//	// 동등 객체를 판단할 때
//	// equals()를 오버라이딩하면 hashCode()도 함께 오버라이딩하는 것이 일반적
//	@Override
//	public int hashCode() {
//		return Objects.hash(studentNo, name);
//	}
	
	
	
	
	@Override
	public String toString() {
		return "[학번 = " + studentNo + ", 이름 = " + name + ", 전공 = " + major + "]";
	}

	
	// 자동완성
	@Override
	public int hashCode() {
		return Objects.hash(name, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNo == other.studentNo;
	}
}