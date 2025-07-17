package sec02.exam01;

public class SignOperatorEx {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte b = 100;
//		byte result = -b; 	// int 이하 정수의 연산은 int로 연산 (자동 형변환)
		int result3 = -b; 	// 
		
		System.out.println(result3);
	}

}
