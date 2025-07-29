package override_hw.hw1.run;

import java.util.Scanner;

import override_hw.hw1.model.vo.Employee;
import override_hw.hw1.model.vo.Student;


public class Run {

	public static void main(String[] args) {
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템광학과");
		studentArr[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		studentArr[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for (Student students : studentArr) {
			System.out.println(students);
		}
		
		Employee[] employeeArr = new Employee[10];
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== 사원 입력받기 ===");
			
		}
	}

}
