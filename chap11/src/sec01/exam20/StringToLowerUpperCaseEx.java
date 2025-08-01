package sec01.exam20;

public class StringToLowerUpperCaseEx {

	public static void main(String[] args) {
		String str1 = "Java Progamming";
		String str2 = "JAVA Progamming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
