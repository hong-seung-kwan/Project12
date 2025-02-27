package collection;

import java.util.ArrayList;
import java.util.List;

// List
public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
//		// 부모타입 변수 = 자식 인스턴스
//		List<Integer> list2 = new ArrayList<Integer>();
		// add: 리스트에 값을 추가하는 함수
		list.add(10);
		list.add(20);
		list.add(30);
		// get: 리스트에서 값을 꺼내는 함수
		// index를 이용하여 특정 요소를 꺼낸다
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// 리스트는 값이 순차적으로 저장된다
		
		// remove: 특정 요소를 삭제
		list.remove(0);
		System.out.println(list);
		
		// 리스트는 중간의 요소가 삭제되면 뒤에있는 요소들이 앞으로 이동한다
		
		// size: 리스트의 길이
		int size = list.size();
		System.out.println(size);
	}

}
