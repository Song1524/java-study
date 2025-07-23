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
	public boolean strCheck(String str) {
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
	        	System.out.println("영문자가 포함되어 있습니다.");
	            return true;
	        }
	    }
	    System.out.println("영문자가 포함되어 있지 않습니다.");
	    return false;
	}

	
	// 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현
	public int strCount(String str, char ch) {
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == ch) count++;
	    }
	    System.out.println("'" + ch + "'의 개수: " + count);
	    return count;
	}
	
	// 전달된 정수의 구구단을 출력하는 메소드 구현
	public void timesTable(int x) {
	    System.out.println(x + "단");
	    for (int i = 1; i <= 9; i++) {
	        System.out.println(x + " x " + i + " = " + (x * i));
	    }
	}



}
