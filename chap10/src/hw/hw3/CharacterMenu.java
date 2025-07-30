package hw.hw3;

import java.util.Scanner;

public class CharacterMenu{
	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		String str;
		
		System.out.print("문자열: ");
		str = sc.nextLine();
	
		try {
			int count = cc.countAlpha(str);
			System.out.println("\'" + str + "\'에 포함된 영문자 개수: " + count);
		} catch (CharCheckException e) {
			e.printStackTrace(); // 요구된 출력 형식: 예외 메시지 + 위치
		}
		sc.close();
	}
	
}
