package hw.hw04;

public class Homewok {
	int sum = 0;
	
	// 전달된 메세지를 출력하는 메소드 구현
	public String print(String str) {
		System.out.println(str);
		return str;
	}
	
	// 1~100까지 합을 반환하는 메소드구현
	public int sum1To100() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		return sum;
	}
	
	// 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
	public boolean num(int x) {
		System.out.println("짝수: true, 홀수: false");
		if (x % 2 == 0) {
			System.out.println(true);
			return true;			
		} else {
			System.out.println(false);		
			return false;			
		}
	}
	
	// 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
	public String strCheck(String str) {
	
		return str;
	}
	
	// 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현
	public String strCount(String str) {
		
		return str;
	}
	
	// 전달된 정수의 구구단을 출력하는 메소드 구현
	public int times(int x) {
		int i = 0, j = 0;
		int and = i * j;
		for(i = 1; i == x;) {
			System.out.println(x + "단");
			for (j = 0; j < 9; j++) {
				System.out.println(i + " x " + j + " = " + and);
			}
		}
		return and;
	}


}
