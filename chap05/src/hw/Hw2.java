package hw;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			} 
			if (num == 0) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
            if (num > 9) {
                System.out.println("9 이하의 숫자만 입력해주세요.");
                continue;
            } else if (num >= 1 && num <= 9) {
				for (int i = num; i < 10; i++) {
					System.out.println("=== " + i + "단 ===");
					for (int j = 1; j < 10; j++) {
						System.out.println( i + " X " + j + " = " + i * j);
					}
				}
			}
		}
	}
}




