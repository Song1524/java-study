package sec01.exam19;

public class StringSubstringEx {

	public static void main(String[] args) {
		String ssn = "010108-3030310";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String seconNum = ssn.substring(7);
		System.out.println(seconNum);
	}

}
