package sec02.exam01;

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 상위 타입 참조 변수에 하위 객체 대입 가능
		// 자동 타입 변환 발생
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속 관계가 아니기 때문에 타입변환 X
//		B b2 = e;
//		C c2 = d;
	}

}
