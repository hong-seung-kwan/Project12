package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz3 {

	public static void main(String[] args) {
		
		HashMap<String, Float> map = new HashMap<String, Float>();
		
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Collection<String> subject = map.keySet();
		System.out.println("과목명: " + subject);
		
		Set <String> keyset = map.keySet();
		
		
		Collection<Float> score = map.values();
		System.out.println("점수: " + score);
		
		
	}

}
