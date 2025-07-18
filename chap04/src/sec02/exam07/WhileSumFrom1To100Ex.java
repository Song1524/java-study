package sec02.exam07;

import java.util.Scanner;

public class WhileSumFrom1To100Ex {

	public static void main(String[] args) {
		// 1부터 100까지 합 구히기
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ " + (i - 1) + "까지의 합: " + sum);
		
		int count = 1;
		while (true) {
			System.out.println("무한반복" + count);
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;				
			}
			count++;
		}
		
		count = 1;
		boolean flag = true;
		while (flag) {
			System.out.println("무한반복" + count);
			
			if (count == 6) {
				flag = false;
			}
			count++;
		}
		
		// do-while문으로 작성
		// 1부터 100까지 합
		sum = 0;
		i = 1;
		
		do {	// 처음 한번은 무조건 실행
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println("1 ~ " + (i - 1) + "까지의 합: " + sum);
		
		// 최소 한 번은 실행해야 하는 호직에 유용하지만, 실무에서는 거의 사용되지 않음
		
		System.out.println("--------------------");
		// Quiz1: 1부터 100까지 홀수의 합
		sum = 0;
		int j = 1;
		while (j <= 100) {
			
			if (j % 2 != 0) {
				sum += j;
			}
			j++;
		}
		System.out.println("1부터 100까지의 홀수의 합: " + sum);
		
		System.out.println("--------------------");
		// Quiz2:
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
//		
//		힌트: 
//		1) 마지막 자리 수 더하기
//		2) 마지막 자리 제거
		
		Scanner sc = new Scanner(System.in);
		
		sum = 0;
		
		System.out.print("자연수를 입력하세요: ");
		int num = sc.nextInt();
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println("각 자리수의 합 = " + sum);

	}

}
// Quiz2 풀이

// 123 % 10 == 3  		sum에 +3		현재 sum 값: 3
// 123 / 10 == 12

// 12 % 10 == 2 	 	sum에 +2		현재 sum 값: 5
// 12 / 10 == 1

// 1 % 10 == 1 	 		sum에 +1		현재 sum 값: 6


