package sec02.hw;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요: ");
		String str = sc.nextLine();
		
		String str1 = (str.equals("간다")) ? "온다" : "간다";
		
		System.out.println("앵무새: " + str1);
		
	}

}
