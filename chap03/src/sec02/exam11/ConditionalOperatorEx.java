package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperatorEx {
	
	public static void main(String[] args) {
		int score = 75;
		
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		System.out.println("---------------------------");
		
		// Quiz
//		0~100사이의 점수를 입력받아
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt();
		String grade1 =  (score1 >= 60 && score1 < 101) ? "합격" : ((score1 > 100 || score1 < 0) ? "점수 입력 오류" : "불합격");
		
		System.out.println(grade1);
		
	}
}
