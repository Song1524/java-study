package hw.array;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력해세요: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[num1];
		
//		int num2;
//		String[] copyArr = new String[num1 + num2];

		int i;
		String str;
		String answer;
		
		for (i = 0; i < num1; i++) {
			System.out.print(i + 1 + "번째 문자열: ");
			str = sc.nextLine();
			
			arr[i] = str;	
			}
		
		System.out.println("더 값을 입력하시겠습니까?(Y/N): ");
		answer = sc.nextLine();
		
		if (answer.equals("N")) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		} else if (answer.equals("Y")) {
			System.out.println("더 입력하고 싶은 개수: ");
//			num2 = sc.nextInt();
			

			}
	}
}


