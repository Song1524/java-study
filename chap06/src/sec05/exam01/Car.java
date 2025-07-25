package sec05.exam01;

public class Car {
	// 필드(인스턴스 필드)
	String model;
	int speed;
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드(인스턴스 메소드)
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			setSpeed(i);	// this. 생략가능
			System.out.println(this.model + "가 달립니다.(시속: " + this.speed + "km/h)");
			// 출돌날 일이 없으므로 this 생략가능
		}
	}

}
