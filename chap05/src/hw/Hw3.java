package hw;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        for (;;) {
            System.out.print("입력 : ");
            input = sc.nextLine();

            if (input.equals("탈출")) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println(input);
        }
    }
}