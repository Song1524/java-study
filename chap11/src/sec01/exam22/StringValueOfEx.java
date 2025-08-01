package sec01.exam22;

public class StringValueOfEx {

	public static void main(String[] args) {
		// 기본 타입 값을 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("--------------------------");
		
		// 문자열로 변환하는 간단한 방법
		String str11 = "" + 10;
		String str22 = "" + 10.5;
		String str33 = "" + true;
		
		System.out.println(str11 + ", " + str11.getClass().getName());
		System.out.println(str22);
		System.out.println(str33);
	}

}
