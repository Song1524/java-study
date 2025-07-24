package sec05.exam05;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("000000-0000000", "송진영");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "uas";	
//		p1.ssn = "111111-1111111";
		p1.name = "김이최";
		System.out.println(p1.name);
	}

}
