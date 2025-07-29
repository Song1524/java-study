package sec02.exam03;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkfare(); // vehicle 인터페이스 타입에 없는 멤버는 사용불가
		
		Bus bus = (Bus) vehicle;	// 강제 타입 변환
		bus.run();
		bus.checkFare();
	}
}