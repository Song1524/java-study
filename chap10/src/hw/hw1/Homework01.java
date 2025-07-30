package hw.hw1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int randomnum = (int) ((Math.random() * 49) + 1);
		
		while (true) {
			System.out.print("1 ~ 50 사이의 숫자: ");
				
			try {
				num = sc.nextInt();
				
				if (num < 1 || num > 51) {
					System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
					continue;
				}		
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				sc.nextLine();
				continue;
			}
			
			if (num < randomnum) {
				System.out.println("Up!");
			} else if (num > randomnum) {
				System.out.println("Down!");
			} else if (num == randomnum) {
				System.out.println("축하합니다~ 정답이에요");
				break;
			}
			
		}
	}

}
