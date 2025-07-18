package hw;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		
		if (age < 3) {	// 3세 미만
			System.out.println("무료입니다.");
		} else if (age >= 3 && age <= 12) {	// 3세 이상 12세 이하
			System.out.println("10000원 입니다.");
		} else if (age >= 13 && age <= 18) {	// 13세 이상 18세 이하
			System.out.println("20000원 입니다.");
		} else if (age >= 19 && age <= 64) {	//19세 이상 64세 이하
			System.out.println("30000원 입니다.");
		} else {
			System.out.println("무료입니다.");
		}
	}

}
