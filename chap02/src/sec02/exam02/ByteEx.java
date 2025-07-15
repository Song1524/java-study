package sec02.exam02;

public class ByteEx {

	public static void main(String[] args) {
		// byte(1byte)
		// 값의 범위: -129 ~ 127
		
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 127;
//		byte var4 = 35333333;	// 범위를 벗어난 값을 저장하려고 하면 컴파일 에러가 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		// 참고: 연산에 의해 값의 범위를 벗어나면 오버플로우 발생
		
		
		System.out.println("-----------------------");
		
		
		byte var5 = 126;
		
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++;		// 오버플로우 발생
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		
		
		System.out.println("-----------------------");
		
		
		byte var6 = -127;
		
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--;		// 언더플로우 발생
		System.out.println(var6);
		var6--;
		System.out.println(var6);
		var6--;
		System.out.println(var6);

		
	}

}
