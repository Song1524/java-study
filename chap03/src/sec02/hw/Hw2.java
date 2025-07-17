package sec02.hw;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수: ");
		int bead = sc.nextInt();
		
		String str = bead % 2 == 0 ? "짝수" : "홀수";
		System.out.println("구슬의 개수는 " + str + "입니다.");
		
	}

}
