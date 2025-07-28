package sec02.exam04;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.driver(bus);		// 자동 타입변환
		
		Taxi taxi = new Taxi();
		driver.driver(taxi);	// 자동 타입변환

	}

	// 다형성을 안쓰면?
	// drive() 메소드를 여러 개 만들어야함
	// 차량이 늘어날수록 메소드 오버로딩이 계속 늘어남
	// 비슷한 기능이 반복됨 -> 코드 중복
	// 유지보수 어려움, 유연성 떨어짐
//	public void drive(Bus bus) {
//		bus.run();
//	}
//	public void drive(Taxi taxi) {
//		taxi.run();
//	}
}
