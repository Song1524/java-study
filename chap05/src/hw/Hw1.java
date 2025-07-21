package hw;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("1 ~ 50 사이의 정수를 입력하세요: ");
			int num = sc.nextInt();
			
			if (num < 1 || num > 50) {
				continue;
			}
			
			int sum = 0;
			for (int i = 0; i <= num; i += 2) {
				sum += i;					
			}
			System.out.println("합계: " + sum);

			break;
		}

	}

}
