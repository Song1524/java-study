package hw;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		int mo = sc.nextInt();
		
		System.out.print("기온: ");
		int c = sc.nextInt();
		
		if (mo == 12 || mo == 1 || mo == 2) {
			System.out.print("겨울 ");
			if (c <= -15) {	//-12 이하면 한파 주의보, -15 이하면 한파 경보
				System.out.println("한파 경보");
			} else if (c <= -12) {
				System.out.println("한파 주의보");
			}		
		} else if (mo == 6 || mo == 7 || mo == 8) {
			System.out.print("여름 ");
			if (c >= 35) {	// 33 이상면 폭염 주의보, 35 이상면 폭염 경보
				System.out.println("폭염 경보");
			} else if (c >= 33) {
				System.out.println("폭염 주의보");
			}
		} else {
			System.out.println("해당 계절이 없습니다.");
		}
	}
}
