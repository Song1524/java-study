package hw;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("게임을 실행합니다!");
            System.out.print("게임을 다시 플레이하시겠습니까? (yes/no): ");
            answer = sc.nextLine();
        } while (answer.equals("yes"));

        System.out.println("게임을 종료합니다.");
	}

}
