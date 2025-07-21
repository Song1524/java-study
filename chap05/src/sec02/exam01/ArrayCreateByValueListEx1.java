package sec02.exam01;

public class ArrayCreateByValueListEx1 {

	public static void main(String[] args) {
		// 값 목록을 이용해서 배열 생성
		// 1. 배열 변수 선언과 동시에 값 대입
		
//		int[] scores = new int[] {83, 90, 87};
		int[] scores = {83, 90, 87};	// 리터럴 방싱(축약형)
		
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		
		// 반복문을 이용한 합계 구하기
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.println("배열의 총 합: " + sum);
		double avg = sum / 3.0;
		System.out.println("배열이 평균: " + avg);
		
		System.out.println("-----------------------");
		
		// Quiz: 
//		아래와 같은 문자열을 담는 과일 배열을 만들고 반복문을 이용하여 배열의 모든 요소를 출력해보세요.
//		"사과", "바나나", "오렌지", "포도", "딸기"
		
		String[] fruits = {"사과", "바나나", "오렌지", "포도", "딸기", "복숭아", "수박"};
		
		for (int j = 0; j < fruits.length; j++) {
			System.out.println(fruits[j]);
		}
		
	}

}
