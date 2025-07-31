package sec01.exam13;

import java.util.Scanner;

public class StringCharAtEx {

	public static void main(String[] args) {
		// 주민등록번호에서 남자와 여자를 구분하는 방법
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력: ");
		String ssn = sc.nextLine();
		
		char sex = ssn.charAt(7);	// 문자열에서 특정 인덱스의 문자 추출
		
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
				
			default:
				System.out.println("잘못된 입력입니다.");
		}
	}

}
