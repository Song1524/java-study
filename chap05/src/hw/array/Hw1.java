package hw.array;

public class Hw1 {

	public static void main(String[] args) {
		int[] hight = {152, 180, 165, 158, 171};
		
//		Arrays.sort(hight);
//		
//		for (int i = 0; i < hight.length; i++) {	
//			System.out.println(hight[i]);
//		}
		
	    for (int i = 0; i < hight.length - 1; i++) {
	        for (int j = 0; j < hight.length - i - 1; j++) {
	        	// i를 빼주는 이유? 1회전 돌때마다 마지막 정렬된 여서는 비겨하지 않아도 됨
	            if (hight[j] > hight[j + 1]) {
	            	// 두 값을 교환
	                int temp = hight[j];
	                hight[j] = hight[j + 1];
	                hight[j + 1] = temp;
	            }
			}
		}
	    
	    for (int i = 0; i < hight.length; i++) {
			System.out.println(hight[i]);
		}
	} 
}

//디버깅 실습
//1. Step Into(F5)
//현재 실행 중인 코드 줄에서 호출하는 메소드 내부로 들어감
//메소드의 세부 구현을 보고 싶을 때 사용
//사용 시기: 호출된 메소드 내부 로직을 살펴보고 싶을 때
//
//2. Step Over(F6)
//현재 코드 줄을 실행하고 다음 줄로 이동하지만, 호출된 메소드 내부로는 들어가지 않음
//메소드의 결과만 보고 내부 동작은 관심 없을 때 사용
//사용 시기: 로직 흐름을 빠르게 따라가고 싶을 때, 메소드 내부는 중요하지 않을 때
//
//3. Resume(F8)
//다음 중단점까지 코드 실행을 계속 진행
//더 이상 한 줄씩 실행하지 않고, 프로그램이 알아서 흐름을 따라가게 둠
//사용 시기: 다음 중단점까지 실행을 이어가고 싶을 때


//| 기능       | 단축키 | 설명                          | 사용 용도
//| --------- | ---- | ---------------------------- | -----------------------------
//| Step Into | F5   | 메소드 안으로 들어감              | 메소드 내부 로직 확인
//| Step Over | F6   | 메소드 실행은 하고, 내부는 안 들어감 | 흐름만 따라가고, 세부는 안 봐도 될 때
//| Resume    | F8   | 다음 중단점까지 실행              | 다음 디버깅 지점까지 실행하고 싶을 때






