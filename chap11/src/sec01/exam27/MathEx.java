package sec01.exam27;

import java.util.Scanner;

public class MathEx {
	public static void main(String[] args) {
		// 절댓값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		System.out.println("----------------------");
		
		// 올림
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		System.out.println("----------------------");
		
		// 내림
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		System.out.println("----------------------");
		
		// 최댓값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		System.out.println("----------------------");
		
		// 최솟값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		System.out.println("----------------------");
		
		// 랜덤값
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		System.out.println("----------------------");
		
		// 가까운 정수의 실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		System.out.println("----------------------");
		
		// 반올림
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		System.out.println("----------------------");
		
		// 거듭제곱
		System.out.println(Math.pow(10, 2));
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(5, 0));
		System.out.println(Math.pow(9, 0.5));
		
		System.out.println("----------------------");
		// 소수점 이라 특정 자리에서 반올림하기
		// Quiz: 사용자에게 몇째 자리에서 반올림 할지 입력받아 처리

		double value = 12.3456;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("12.3456를 소수점 몇째 자리에서 반올림?: ");
		int round = sc.nextInt();
		
		double temp1 = value * Math.pow(10, round - 1);
		double temp2 = Math.round(temp1);
		double result = temp2 / Math.pow(10, round - 1);
		System.out.println("결과: " + result);	
		
	}
}
