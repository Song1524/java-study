package sec02.exam10;

import java.lang.foreign.ValueLayout;
import java.util.Scanner;

public class AssignmentOperatorEx {

	public static void main(String[] args) {
		int result = 10;
		result += 10;
		System.out.println("resule = " + result);

		result -= 10;
		System.out.println("resule = " + result);
		
		result *= 10;
		System.out.println("resule = " + result);
		
		result /= 10;
		System.out.println("resule = " + result);

		result %= 10;
		System.out.println("resule = " + result);
		
		System.out.println("------------------------");
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원: 11개
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력: ");
//		int value1 = sc.nextInt();
//		int a = value1 / 500;
//		int b = (value1 - (a * 500)) / 100; 
//		int c = (value1 -((a * 500) + (b * 100))) / 50;
//		int d = (value1 -((a * 500) + (b * 100) + (c * 50))) / 10;
//		int e = (value1 -((a * 500) + (b * 100) + (c * 50) + (d * 10))) / 1;
//		
//		System.out.println("500원: "  + a + "개");
//		System.out.println("100원: " + b + "개");
//		System.out.println("50원: " + c + "개");
//		System.out.println("10원: " + d + "개");
//		System.out.println("1원: " + e + "개");
		
		int amount = sc.nextInt();
		
		int coin500 = amount / 500;
		amount %= 500;
		
		int coin100 = amount / 100;
		amount %= 100;

		int coin50 = amount / 50;
		amount %= 50;
		
		int coin10 = amount / 10;
		amount %= 10;
		
		int coin1 = amount; // 남은 금액은 전부 1원
		
		System.out.println("500원: " + coin500 + "개");
		System.out.println("100원: " + coin100 + "개");
		System.out.println("50원: " + coin50 + "개");
		System.out.println("10원: " + coin10 + "개");
		System.out.println("1원: " + coin1 + "개");
		
	}

}

