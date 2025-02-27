package generic;

import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		// E 문자기호: 타입변수 재네릭타입
		// 리스트에 저장할 데이터의 타입을 외부에서 결정!
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 클래스 내부에서는 문자기호를 쓰고
		// 외부에서 변수의 타입을 결정
		list.add(10);
		
		int i = list.get(0);
		
		// 데이터 타입을 String으로 설정
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("abc");
		String str = list2.get(0);
		
		
	}

}
