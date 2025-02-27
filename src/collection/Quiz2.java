package collection;

import java.util.ArrayList;

// Character 타입 ArrayList 생성
// 문자 3개 추가 'A' 'B' 'C'
// 리스트에 'A' 있으면 삭제
public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
//		for(int i = 0; i < list.size(); i++) {
//			char a = list.get(i);
//			if(a == 'A') {
//				list.remove(i);				
//			}
//		}
//		System.out.println(list);
		
		//contains: 리스트안에 특정값이 포함되어있는지 확인하는 함수
		System.out.println(list.contains('A'));
		
		if(list.contains('A')) {
			int index = list.indexOf('A');
			System.out.println(index);
			list.remove(index);
		}
		System.out.println(list);
	}

}
