package sec04.exam03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gassState = myCar.isLeftGas();
		if (gassState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
	
		if (myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");			
		}
	
	
	
	
	
	}

}
