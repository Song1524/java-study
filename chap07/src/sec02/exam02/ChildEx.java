package sec02.exam02;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// Parent 타입으로 자동 타입변환
		
		parent.metod1();		
		parent.metod2();	// 재정의 된 자식쪽의 메소드가 호출됨		
//		parent.metod3();	// Parent 타입에 없는 필드나 메소드는 접근 불가능
		
		// 정리: 참조 변수의 타입은 객체를 다룰 수 있는 리모컨이라고 생각하자
		
		
	}

}
