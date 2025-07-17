package sec02.hw;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구의 수: ");
		int friend = sc.nextInt();
		
		System.out.print("사탕의 수: ");
		int candy = sc.nextInt();
		
		int p1c = candy / friend;
		int restCandy = candy % friend;
		
		System.out.println("1인당 사탕 개수: " + p1c);
		System.out.println("남는 사탕 개수: " + restCandy);
		
		
	}

}
