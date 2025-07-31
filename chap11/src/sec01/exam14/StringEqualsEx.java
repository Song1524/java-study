package sec01.exam14;

public class StringEqualsEx {

	public static void main(String[] args) {
		String strVal1 = new String("송진영");
		String strVal2 = "송진영";
		String strVal3 = "송진영";
		
		if (strVal1 == strVal2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (strVal2 == strVal3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		System.out.println("-------------------------");
		
		if (strVal1.equals(strVal2)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		
		if (strVal2.equals(strVal3)) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
	}

}
