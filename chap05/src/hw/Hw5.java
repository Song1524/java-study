package hw;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		while (true) {
			System.out.print("숫자(0을 입력하면 종료): ");
			num = sc.nextInt();
			
			if (num < 0) {
				continue;
			} else if (num > 0) {
				sum += num;
			}
			
			if (num == 0) {
				System.out.println("양수의 합계: " + sum);
				System.exit(0);
			}
 		}

		

    }

}
