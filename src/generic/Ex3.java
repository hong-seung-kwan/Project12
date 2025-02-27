package generic;

public class Ex3 {

	public static void main(String[] args) {
		
		// 파우더를 사용하는 프린터기 생성
		// 프린터기를 생성하는 시점에 사용할 재료를 결정 -> 제네릭의 목적
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter();
		// 재료를 삽입
		printer1.setMeterial(new Powder());
		//
		Powder powder = printer1.getMeterial();
		powder.doPrint();
		
		// 플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter();
		printer2.setMeterial(new Plastic());		
		Plastic plastic = printer2.getMeterial();
		plastic.doPrint();
		
		// 재네릭 클래스를 사용하는 이유:
		// 클래스를 정의할 때 타입을 고민할 필요가 없다
		// 여러가지 타입을 사용할 수 있다
	}

}
// 제네릭 클래스 만들기
// 타입변수 제네릭타입
class ThreeDPrinter<T> { // 클래스이름<문자기호>  문자기호 :자유롭게 입력 가능
	
	private T meterial;

	public void setMeterial(T t) {
		this.meterial = t;
	}

	public T getMeterial() {
		return this.meterial;
	}
}