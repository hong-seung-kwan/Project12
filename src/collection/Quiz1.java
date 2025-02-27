package collection;

import java.util.ArrayList;

// Character타입의 Arraylist
// 문자 3개추가('A' 'B' 'C')
// 리스트의 요소 하나씩 출력
// 리스트에서 두번째 삭제
// 리스트 크기 출력
public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println(list.size());
//		System.out.println(list);
	}

}
