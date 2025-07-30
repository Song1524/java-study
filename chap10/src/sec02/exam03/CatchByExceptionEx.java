package sec02.exam03;

public class CatchByExceptionEx {

	public static void main(String[] args) {
		// 2가지 예외가 발생 가능
		// 하나의 try catch문으로 합치기(다중 catch 사용)
		
		try {
			String data1 = args[0];	// 실행 예외 발생
			String data2 = args[1];			

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값으 수가 부족합니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {
			System.out.println("다시 실행하세요");
		}
	}

}
