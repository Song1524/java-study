package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격: %d원\n", value);
		System.out.printf("상품의 가격: %6d원\n", value);		// 정수 출력 + 최소 6자리 폭 확보 (오른쪽 정렬)
		System.out.printf("상품의 가격: %-6d원\n", value);		// 정수 출력 + 최소 6자리 폭 확보 (왼쪽 정렬)
		System.out.printf("상품의 가격: %06d원\n", value);		// 6자리 확보 + 빈 자리는 0으로 채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %1$d인 원의 넓이: %2$10.2f\n", 10, area);		// %1$d → 첫 번째 인자 (10), %2$10.2f → 두 번째 인자 (area)
																			// 10.2f는 소수점 둘째 자리까지, 총 폭 10자리
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area); // 순번을 생략하면 차례대로 대입됨
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);		// %-10s → 문자열 왼쪽 정렬 (10자리)
																		// %10s → 문자열 오른쪽 정렬 (10자리)
		
	}

}
