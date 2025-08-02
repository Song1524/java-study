package hw.hw2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Practice practice = new Practice();
		
		System.out.print("주소를 입력하세요: ");
		String input = sc.nextLine();
		
		String result = practice.takeState(input);
		System.out.println(result);

	}

}
