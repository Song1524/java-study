package hw;

import java.util.Scanner;

public class Hw8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열: ");
			String str = sc.nextLine();

			System.out.print("문자: ");
			char ch = sc.nextLine().charAt(0);
			
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            System.out.println("포함된 개수: " + count);
		
            while (true) {
                System.out.print("다시 입력하시겠습니까? : ");
                String answer = sc.nextLine();

                if (answer.equalsIgnoreCase("y")) {
                    break;
                } else if (answer.equalsIgnoreCase("n")) {
                    System.out.println("프로그램 종료");
                    System.exit(0);
                } else {
                    System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
                }
            }
		}
	}
}
