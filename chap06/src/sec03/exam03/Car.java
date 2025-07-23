package sec03.exam03;

public class Car {
	// 필드 
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {	// 1번
		
	}
	
	Car(String model) {	// 2번
		this.model = model;
	}
	
	Car(String model, String color) {	// 3번
		this.model = model;
		this.color = color;
	}
	
	// 주의! 매개변수 이름만 바꾸는 것은 오버로딩이 아님(타입 중요!)
//	Car(String color, String model) 
//		this.model = model;
//		this.color = color;
//	}

	Car(String model, String color, int maxSpeed) {	// 4번
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	// 오버로딩 가능함 (매개변수의 타입, 순서가 다름, 위에는 String, String, int인데 
	// 밑에는 String, int, String이라 컴파일러가 다른 것으로 인식)
//	Car(String model, int maxSpeed, String color) {	
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
//	}
}
