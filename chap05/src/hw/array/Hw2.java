package hw.array;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int result;
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			result = sc.nextInt();
			
			arr[i] = result; 
			
			sum += result;
			
		}
		
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]  + " ");
		}
		
		System.out.println();
		
		System.out.println("총합: " + sum);
	}

}
