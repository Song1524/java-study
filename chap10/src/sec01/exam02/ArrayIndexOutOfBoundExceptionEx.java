package sec01.exam02;

public class ArrayIndexOutOfBoundExceptionEx {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int result = arr[0] + arr[2];
//		int result = arr[0] + arr[3];	// 예외 발생
		
		System.out.println(result);
		
		String data1 = args[0];	// 예외 발생. 배열의 안에 아무것도 없는데 값을 출력하라고함
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}

}
