package sec02.exam03;

public class LongEx {

	public static void main(String[] args) {
		// long(8bye)
		
		long var1 = 10;
		long var2 = 20L;			// L을 붙여도 상관 X
//		long var3 = 20000000000;	// 자바 컴파일러는 정수 ㄹ리터럴을 기기본적으로 
									// integer 타입으로 해석
									// 200억이 integer 타입의 범위를 넘기 때문에 컴파일 에러 발생
		long var4 = 20000000000L;	// L or l 을 붙이면 long 타입으로 해석
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}

}
