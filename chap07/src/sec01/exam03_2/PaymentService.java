package sec01.exam03_2;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스(미완성 클래스)
public abstract class PaymentService {	// <-- 실제로는 실행 안됨(자식 클래스에서 다 재정의 했기 때문)
//	public void pay(int amount) {
//		System.out.println("결제 금액: " + amount + "원");
//		System.out.println("결제를 처리합니다.");
//	}
	
	// 추상 메소드(미완성 메소드): 자식 클래스에서 반드시 구현해야 함(재정의 필수, 안하면 자식 클래스에서 에러)
	public abstract void pay(int amount);
	
}
