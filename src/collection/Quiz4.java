package collection;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		System.out.println("MemberArrayList를 생성하고 4명의 회원을 추가하세요!");
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		memberArrayList.addMember(new Member(1001, "둘리"));
		memberArrayList.addMember(new Member(1002, "또치"));
		memberArrayList.addMember(new Member(1003, "도우너"));
		memberArrayList.addMember(new Member(1004, "고길동"));
		
		memberArrayList.showAllMember();
		
		System.out.println("MemberArrayList에 1004번 회원이 있으면 삭제하세요!");
		memberArrayList.removerMember(1004);
		memberArrayList.showAllMember();
		
		memberArrayList.removerMember(1005);
		

	}

}

class MemberArrayList{
	
	ArrayList<Member> list;
	
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트 생성
	}
	
	public MemberArrayList(ArrayList<Member> list) {
		super();
		this.list = list;
	}

	public void addMember(Member member) {
		list.add(member);
	}
	
	public void removerMember(int memberId) {
		
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			
			if(member.memberId == memberId) {
				list.remove(i);
				System.out.println(memberId+"번 회원을 삭제하였습니다");
				return; // 함수종료
			}
		}
		System.out.println(memberId + "번 회원이 없습니다");
	}
	
	public void showAllMember() {
		
		for(Member member:list) {
			
			System.out.println(member);
		}
	}
}