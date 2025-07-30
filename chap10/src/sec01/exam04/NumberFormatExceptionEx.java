package sec01.exam04;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String data1 = "100";
//		String data2 = "a100";
		String data2 = "200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	// 예외 발생
		
		int result = value1 + value2;
		System.out.println(value1 + " + " + value2 + " = " + result);
	}

}
