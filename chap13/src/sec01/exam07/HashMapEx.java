package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// new 연산자로 생성했기 때문에 서로 다른 객체
		// 내부 데이터가 같을 때 동등 키로 판단하려면 hashCode(), equals() 재정의
		map.put(new Student(1, "송진영"), 95);
		map.put(new Student(1, "송진영"), 100);
		
		System.out.println(map);

		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
