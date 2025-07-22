package hw.array;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
			System.out.print("정수: ");
			num = sc.nextInt();
			
			if (num < 3 || num % 2 == 0) {
				System.out.println("다시 입력하세요");
			} else {
				break;
			}
		}
		
		int[] arr = new int[num];
		int mid = num / 2;
		int v = 0;
		
		for (int i = 0; i <= mid ; i++) {
			arr[i] = ++v;
		}
		
		for (int i = mid + 1; i < num ; i++) {
			arr[i] = --v;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
	}

}
