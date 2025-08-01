package sec01.exam17;

public class StringLengthEx {

	public static void main(String[] args) {
		String ssn = "0101083030310";
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 틀립니다.");
		}
	}

}
