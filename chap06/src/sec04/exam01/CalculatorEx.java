package sec04.exam01;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);	// byte -> int 타입으로 자동 형변환
		System.out.println("result2: " + result2);
		
//		double result = myCalc.divide(10.0, 20.0);	// 잘못된 매개값 사용
		
		myCalc.powerOff();
	}

}
