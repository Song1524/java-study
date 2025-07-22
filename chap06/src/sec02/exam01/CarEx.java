package sec02.exam01;

public class CarEx {

	public static void main(String[] args) {
		// 클래스 외부(다른 클래스)에서의 필드 사용
		// => 객체를 먼저 생성한 뒤 해당 객체에 접근하여 사용
		// 필드는 객체의 데이터이기 때문에 객체 없이는 쓸 수 없음
		
		// 객체 생성
		Car myCar = new Car();	// new 연산자 + 생성자 호출
		
		// 필드 값 읽기
		System.out.println("제작 회사: " + myCar.company);	// 도트(.) 연산자, 객체 접근 연산자
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고 속도: " + myCar.maxSpeed);
		System.out.println("현재 속도: " + myCar.speed);	// 초기값이 없으므로 
														// int 타입의 기본값인 0이 들어감
		// 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 현재 속도: " + myCar.speed);
	}

}
