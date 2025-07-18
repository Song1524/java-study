package hw;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수: ");
		int num2 = sc.nextInt();
		
		System.out.print("세 번째 정수: ");
		int num3 = sc.nextInt();

		if (num1 < num2 && num1 < num3) {
			System.out.println("세 수 중에서 가장 작은 수는 " + num1 + "입니다.");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("세 수 중에서 가장 작은 수는 " + num2 + "입니다.");
		} else if (num3 < num1 && num3 < num2) {
			System.out.println("세 수 중에서 가장 작은 수는 " + num3 + "입니다.");
		}
	}

}
