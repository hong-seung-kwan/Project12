package map;

// 학생 목록 저장할 맵
// 학생 클래스 : 학번 이름 국어점수 수학점수 영어점수
// 학생 3명 생성
// 학생별 총점 평균 출력
// 과목별 총점 평균 출력


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Quiz4 {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();

		map.put(1, new Student(1001, "둘리", 90, 80, 70));
		map.put(2, new Student(1002, "도우너", 55, 65, 75));
		map.put(3, new Student(1003, "또치", 80, 50, 50));

		System.out.println(map);

		// 학생별 총점 , 평균 ??
		
		// Collection ?? List와 Set의 부모 
		Collection<Student> values = map.values();
		
		
		for (Student student : values) {
			int sum = student.krScore + student.mtScore + student.enScore;
			System.out.println(student.name + "의 총점: " + sum + ", 평균: " + sum / 3.0);
		}

		// 과목별 총점과 평균점수
		int krsum = 0;
		int mtsum = 0;
		int ensum = 0;

		for (Student student : values) {
			krsum = krsum + student.krScore;
			mtsum = mtsum + student.mtScore;
			ensum = ensum + student.enScore;			
		}
		System.out.println("국어의 총점: " + krsum + ", 평균: " + krsum / 3.0);
		System.out.println("수학의 총점: " + mtsum + ", 평균: " + mtsum / 3.0);
		System.out.println("영어의 총점: " + ensum + ", 평균: " + ensum / 3.0);
	}

}

class Student {
	int studentId;
	String name;
	int krScore;
	int mtScore;
	int enScore;

	public Student(int studentId, String name, int krScore, int mtScore, int enScore) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.krScore = krScore;
		this.mtScore = mtScore;
		this.enScore = enScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", krScore=" + krScore + ", mtScore=" + mtScore
				+ ", enScore=" + enScore + "]";
	}

}