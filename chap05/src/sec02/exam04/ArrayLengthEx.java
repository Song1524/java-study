package sec02.exam04;

public class ArrayLengthEx {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		scores = new int[] {83, 90, 87, 90};		// length 속성을 쓰면 배열이 변경됐을 때
													// 코드 변경이 용이
		
		int sum = 0;
//		for (int i = 0; i < 3; i++) {				// 여기서 3은 배열 요소의 개수이므로 
		for (int i = 0; i < scores.length; i++) {	// 배열.length 속성을 활용하면 좋음
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균: " + avg);
		
		System.out.println("---------------------");		
		
		// Quiz
//		총 10명의 학생들의 출석 여부를 표현한 배열 attendance가 있습니다. 
//		학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다. 
//		출석한 학생의 수를 계산하여 출력해주세요.
		
		int[] attendance = {1, 1, 1, 1, 1, 0, 1, 0, 0, 1};
		
		int count = 0;
		
		for (int i = 0; i < attendance.length; i++) {
			if (attendance[i] == 1) {
				count += 1; // count++;
			}
		}
		System.out.println("출석한 학생의 수: " + count);
		
		System.out.println("---------------------");		

		// 주어진 배열에서 최댓값 출력하기
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);
		
	}
}
