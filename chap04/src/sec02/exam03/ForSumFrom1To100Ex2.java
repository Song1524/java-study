package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Ex2 {

	public static void main(String[] args) {
		// 1부터 100까지의 합
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + (i -1) + "합: " + sum);
		
		// 참고: 무한 루트
//		int count = 0;
//		for (;;) {
//			System.out.println("무한반복");
//			count++;
//			
//			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
//			if (count ==6) {
//				break;				
//			}
			
			System.out.println("--------------------");
			// Quiz1: 1부터 100까지 짝수의 합
			
			int sum1 = 0;
			
			for (int i1 = 1; i1 <= 100; i1++) {
				if (i1 % 2 == 0) {
				sum1 += i1;
				}
			}
			System.out.println("1 ~ 100까지의 짝수의 합 = " + sum1);
			
			System.out.println("--------------------");
			// Quiz2: 
//			숫자를 입력받아 입력받은 수가 
//			짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//			홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//			을 구하는 프로그램을 구현하시오

//			[입력]  [출력]
//			 10  => 30
//			 11  => 36
			
			Scanner sc = new Scanner(System.in);
			int sum2 = 0;
			int i2;
			
			System.out.print("숫자를 입력하세요: ");
			int num = sc.nextInt();

			
			System.out.print("숫자를 입력하세요: ");
			

			if (num % 2 == 0) { // 짝수인 경우
				for (i2 = 2; i2 <= num; i2 += 2) {
					sum2 += i2;
				}
			} else { // 홀수인 경우
				for (i2 = 1; i2 <= num; i2 += 2) {
					sum2 += i2;
				}
			}
			System.out.println("결과: " + sum2);
			
		}
	}
