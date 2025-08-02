package hw.hw3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이메일을 입력하세요: ");
		String email = sc.nextLine();
		
		String[] emailCheck = email.split("@");
		
		if (!(emailCheck[1].equals("goodee.co.kr"))) {
			System.out.println("유효하지 않은 이메일입니다.");
		} else {
			System.out.println(emailCheck[0].toUpperCase());
		}
	}

}
