package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		map.remove("영어");
		System.out.println(map.size());
		
		System.out.println(map.get("국어"));
		System.out.println(map.get("수학"));
		System.out.println(map);
		
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		for(Integer integer:values) {
			System.out.println(integer);
		}
		
	}

}
