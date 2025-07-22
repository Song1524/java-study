package hw.array;

import java.util.Arrays;

public class Hw4 {

	public static void main(String[] args) {
        int[] numbers = new int[45];

        for (int i = 0; i < 45; i++) {
            numbers[i] = i + 1;
        }

        // 셔플 알고리즘 써도 되려나;;
        for (int i = 0; i < numbers.length; i++) {
            int j =  (int) (Math.random() * 44) + 1;

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        int[] picked = Arrays.copyOf(numbers, 6);

        Arrays.sort(picked);
        
        for (int i = 0; i < 6; i++) {
            System.out.print(picked[i] + " ");
        }
		
	}

}
