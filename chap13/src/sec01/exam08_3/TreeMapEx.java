package sec01.exam08_3;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TreeMap 
		// 키를 자동 정렬해서 저장(기본은 오름차순)
		Map<String, Object> flower = new TreeMap<String, Object>();
		
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", "20000");
		flower.put("day", "10");
		
		System.out.println(flower);
		
		// 내림차순
		flower = new TreeMap<String, Object>(Collections.reverseOrder());
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", "20000");
		flower.put("day", "10");
		System.out.println(flower);

		
		
	}

}
