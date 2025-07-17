package sec02.hw;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		System.out.print("영어: ");
		int english = sc.nextInt();
		
		int total = korean + math + english;
		System.out.println("총점: "  + total);
		
		int avg = total / 3;
		System.out.println("평균: "  + avg);
		
		String grade = (avg >= 90) ? "휴대폰 교체 가능" : "휴대폰 교체 불가능";
		
		System.out.println(grade);

	}

}
