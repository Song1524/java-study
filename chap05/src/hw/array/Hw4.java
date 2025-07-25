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
	// 선생님 풀이
//int[] lottoArr = new int[6];
//int count = 0;
//
//while (count < 6) {
//	int num = (int) (Math.random() * 45) + 1;
//	
//	// 중복 체크
//	boolean dup = false;
//	for (int i = 0; i < count; i++) { // 실제 로또 번호가 들어간 count까지만 체크
//		if (lottoArr[i] == num) {
//			dup = true;
//			break; // 중복되는 값을 찾은 즉시 빠져나감
//		}
//	}
//	
//	// 중복이 아니면 배열에 저장
//	if (!dup) {
//		lottoArr[count] = num;
//		count++;
//	}
//}
//
//// 오름차순 정렬
//Arrays.sort(lottoArr);
//
//for (int num : lottoArr) {
//	System.out.print(num + " ");
//}
