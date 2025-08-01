package hw.hw1;

public class Run {

	public static void main(String[] args) {
	
//		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		Person person1 = new Person();
		
		String[] status = person1.str.split("\\n");
		for (String string : status) {
			String[] data = string.split(",");

			Person person2 = new Person(data[0], Integer.parseInt(data[1]), data[2], data[3].charAt(0));

			System.out.println(person2);
		}
	}

}
