package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// map
public class Ex1 {

	public static void main(String[] args) {
		
		// interface = object
		// 부모타입 변수 = 자식 인스턴스
		// <K, V> : 제네릭 타입
		// key 타입, value 타입
		// int형 키, String 값
		// 제네릭: 클래스 안에서 사용할 데이터의 타입을 클래스 외부에서 결정하는 것
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		// 데이터 추가
		// map은 쌍으로된 데이터를 저장한다
		// Key 중복 x, Value 중복 o
		map.put(1, "사과");
		map.put(2, "바나나");
		map.put(3, "코코넛");
		
		System.out.println(map);
		
		// 키로 데이터 꺼내기
		String str = map.get(1);
		System.out.println(str);
		
		// 데이터 수정하기
		map.replace(2, "블루베리"); // 위치, 새로운값
		System.out.println(map);
		
		// 데이터 삭제하기
		map.remove(1);
		System.out.println(map);
		
		System.out.println("map의 크기: " + map.size());
		
		// 키가 기억 안날때..
		// 리스트, 배열 -> index(0~크기-1)
		// keyset : 키 목록을 구하는 함수
		Collection<Integer> keys = map.keySet();
		System.out.println("키 목록: "+ keys);
		
		// values: 값의 목록을 구하는 함수
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);
		
		//map에 특정키가 포함되었는지 확인
		System.out.println(map.containsKey(2));
	}
}
