package sec02.hw;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String str = sc.nextLine();
		
//		String str1 = (str.equals("간다")) ? "온다" : "간다";
		String str1 = ("간다".equals(str)) ? "온다" : "간다";	// 더 안전한 코드, 변수 쪽에 equals()를 호출하려면, input이 null일 경우 예외(NPE)가 발생할 수 있음
		// 리터럴이나 상수를 앞에 두면, input이 null이어도 안전하게 비교가능(null-safe)
		
		
		System.out.println("앵무새: " + str1);
		
	}

}
