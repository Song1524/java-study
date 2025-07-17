package sec02.exam06;

public class StringConcatEx {

	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = 1 + 3 + "24" + 5;	// 4245
		System.out.println(str5);
	}

}
