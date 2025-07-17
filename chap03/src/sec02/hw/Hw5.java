package sec02.hw;

import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요: ");
		String resident = sc.nextLine();
		
		char num = resident.charAt(7);
		
		String str = (num == 1 || num == 3) ? "남자" : "여자";
		
		System.out.println(str);
						
	}

}


// 1 || 3 이면 남자, 아니면 여자