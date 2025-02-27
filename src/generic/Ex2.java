package generic;

public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		// 재료 생성
		Powder powder = new Powder();
		
		// 프린터기에 재료 삽입
		// 파우더와 플라스틱을 모두 넣을 수 있다!
		printer.setMeterial(powder); // Object object = powder;
		// 프린터기에서 재료 꺼내기
		Object obj = printer.getMeterial();
		
		// 파우더가 가지고 있는 함수 사용하기
		// 실제 인스턴스가 가지고 있는 함수를 사용할 때는, 원래 타입으로 다운캐스팅
		Powder powder2 = (Powder)obj;
		powder2.doPrint(); // 실제 인스턴스가 가지고 있는 함수 사용
	}

}
// 파우더와 플라스틱을 모두 사용하는 프린터기
class ThreeDPrinter3 {
	// Object는 모든 클래스의 부모로, 파우더와 플라스틱의 부모가 된다
	private Object meterial;

	public void setMeterial(Object object) {
		this.meterial = object;
	}

	public Object getMeterial() {
		return this.meterial;
	}
}