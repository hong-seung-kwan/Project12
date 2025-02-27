package collection;

import java.util.ArrayList;
import java.util.List;

// Book클래스 책번호, 제목

// Book타입 리스트
// 리스트 책 3권
// 책 정보 출력
public class Quiz3 {

	public static void main(String[] args) {

		List<Book> list = new ArrayList<Book>();

		list.add(new Book(1, "책1"));
		list.add(new Book(2, "책2"));
		list.add(new Book(3, "책3"));

		Book book1 = list.get(0);
		// toString : 객체의 정보를 문자열로 반환하는 함수
		// 함수의 원형: 주소
		System.out.println(book1.toString());
		System.out.println(book1); // book1.toString()와 같음
		
		// 부모한테 물려받은 함수를 재정의한 경우에는 재정의한 함수를 선택한다
		// 재정의된 함수가 없으면 부모클래스의 함수를 선택한다
		
		Book book2 = list.get(1);
		Book book3 = list.get(2);
		
//		System.out.println(list);

	}

}

class Book {
	int bookNum;
	String bookTitle;

	public Book(int bookNum, String bookTitle) {
		super();
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}
	// object 클래스에서 물려받은 함수를 재정의
	// 주소 -> 데이터
	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookTitle=" + bookTitle + "]";
	}

}