package sec02.exam08;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		while (true) {
			// 1 ~ 6까지의 임의의 정수값
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		// Quiz
//		1에서 n까지의 합을 구하는 중 합계가 1000이 넘는 순간의 
//		n과 n까지의 합을 출력하는 프로그램을 구현하시오.
//		
//		[출력]
//		45까지의 합: 1035
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;   // 누적 합
        int n = 1;     // 시작 수

        while (true) {
            sum += n;

            if (sum > 1000) {
                break;
            }

            n++;
        }

        System.out.println(n + "까지의 합: " + sum); 

	}

}
