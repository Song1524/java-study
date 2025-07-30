package sec02.exam04;

public class CatchOrderEx {

	public static void main(String[] args) {
		try {
			String data1 = args[0];	// 실행 예외 발생
			String data2 = args[1];			

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);			
		} 
//		catch (Exception e) {	// 맨 아래로 내려아함
//			System.out.println("실행에 문제가 있습니다.");
//		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값으 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
			// 모든 예외는 Exception을 상속 받은, 다형성에 의해 모든 예외 객체가 대입 가능(제일 마지막에 위치헤야함)
			// Exception 타입을 쓰는 경우? 예외와 상관없이 공통적으로 예외처리를 할 때(일반적으로 많이씀)
		} finally {
			System.out.println("다시 실행하세요");
		}
	}

}
