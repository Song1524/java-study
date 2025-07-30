package hw.hw4;

import java.util.Scanner;

public class NumberMenu {
	void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		String num1 = sc.nextLine();
		
		System.out.print("정수2: ");
		String num2 = sc.nextLine();
		
		int intNum1 = Integer.parseInt(num1);
		int intNum2 = Integer.parseInt(num2);
		
		NumberController nc = new NumberController();
		
		try {
			boolean result = nc.checkDouble(intNum1, intNum2);
			System.out.println(num1 + "은(는) "+ num2 + "의 배수인가? " + result);			
		} catch (NumberRangeException e) {
//			System.out.println("예외 발생: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
