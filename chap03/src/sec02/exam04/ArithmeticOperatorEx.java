package sec02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		// 정확한 나누기 결과 값을 얻으려면 애포에 double 변수로 선언하던가 아니면 타입 변환을 통해 가능
		double result6 = v1 / v2;
		System.out.println("result6 = " + result6);
		
		System.out.println("------------------");
		
		// Quiz
		// 화면에서 2자리 정수를 입력 받아 10의 자리 미만은 버리고 출력하는 프로그램은 구현
		// [입력] [출력]
		//  55 => 50
		//  60 => 60
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =  a / 10 * 10;
		System.out.println(b);
		
		
		
	}

}
