package sec03.exam02;

public class KoreanEx {

	public static void main(String[] args) {
		Korean k1 = new Korean("송진영", "010108-3030310");
		Korean k2 = new Korean("김아무개", "000000-0000000");
		
		System.out.println("k1.nation: " + k1.nation);
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.ssn: " + k1.ssn);
		
		System.out.println("---------------------------");
		
		System.out.println("k2.nation: " + k2.nation);
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.ssn: " + k2.ssn);
	}

}
