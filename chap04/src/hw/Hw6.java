package hw;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int swPlan = sc.nextInt();
		
		System.out.print("소프트웨어개발 점수:");
		int swDevelop = sc.nextInt();
		
		System.out.print("데이터베이스구축 점수: ");
		int db = sc.nextInt();
		
		System.out.print("프로그래밍언어활용 점수: ");
		int coding = sc.nextInt();
		
		System.out.print("정보시스템구축관리 점수: ");
		int information = sc.nextInt();
		
		int avg = (swPlan + swDevelop + db + coding + information) / 5;
		
		if (swPlan >= 40 && swDevelop >= 40 
						 && db >= 40 
						 && coding >= 40 
						 && information >= 40 
						 && avg >= 60) {
			System.out.println("합격을 축하합니다.");
		} else if (avg < 60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		} else if (swPlan < 40) {
			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		} else if (swDevelop < 40) {
			System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		} else if (db < 40) {
			System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		} else if (coding < 40) {
			System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		} else if (information < 40) {
			System.out.println("정보시스템구축관리 과락으로 불합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("평균 점수: " + avg);
		
	}

}
