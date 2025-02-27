package collection;

import java.util.ArrayList;
import java.util.List;

// List를 사용하여 쇼핑몰 회원 관리 프로그램 구현
public class Ex2 {

	public static void main(String[] args) {
		
		// List 인터페이스는 ArrayList 클래스의 부모
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member(1001, "둘리"));
		list.add(new Member(1002, "또치"));
		list.add(new Member(1003, "도우너"));
		
		Member member1 = list.get(0);
		Member member2 = list.get(1);
		Member member3 = list.get(2);
		
		int size = list.size();
		System.out.println("리스트의 길이: " + size);
		
		list.remove(1);
		size = list.size();
		System.out.println("리스트의 길이: " + size);
		
		for(Member member:list) {
			System.out.println(member);
		}
	}

}

// 쇼핑몰 회원
class Member{
	
	int memberId; // 회원아이디
	String memberName; // 회원이름
	
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	// Object 클래스에서 상속받은 함수를 재정의
	// toString: 객체의 정보를 문자열로 반환하는 함수
	// 주소 -> 데이터
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	
		
}