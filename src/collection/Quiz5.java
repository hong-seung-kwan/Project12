package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 정수 타입Hashset 생성
// set 숫자3개
// set 크기 출력
// set 요소 하나씩 출력
public class Quiz5 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		System.out.println(set.size());
		
//		Iterator<Integer> iterator = set.iterator();
//		
//		while(iterator.hasNext()) {
//			Integer integer = iterator.next();
//			System.out.println(integer);
//		}
		
		for(Integer integer :set) {
			System.out.print(integer+ " ");
			
		}

	}

}
