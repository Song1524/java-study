package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		// 버스일 떄는 승차요금 확인(checkfare() 기능)이 필요
//		if (vehicle instanceof Bus) {	// ~ 의 인스턴스가 맞는지?(~ 부터 만들어졌는지?)	
//			// 안전하게 검가 후 강제 타입변환
//			Bus bus = (Bus) vehicle;
//			bus.checkFare();
//		}
		
		// instanceof 자동 타입변환
		if (vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		
		vehicle.run();
	}
}
