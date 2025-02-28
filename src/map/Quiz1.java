package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {
		
		HashMap<Character, String> map = new HashMap<Character, String>();
		
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		
		String str = map.get('b');
		map.replace('b', "블루베리");
		map.remove('a');
		System.out.println(map);
			
	}

}
