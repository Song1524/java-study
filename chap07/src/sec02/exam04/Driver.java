package sec02.exam04;

public class Driver {
	// 부모 타입의 매개변수(참조타입)이면 Vehicle 자신의 객체 뿐만 아니라 자식 객체도 들어올 ㄴ수 있다.
	// 운전자는 버스, 택시 모두 운전 가능
	public void driver(Vehicle vehicle) {
		vehicle.run();
	}

}
