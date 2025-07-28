package sec03.exam03;

public class PaymentEx {

	public static void main(String[] args) {
		// 카드 결제
		CardPayment cardPayment = new CardPayment();
		cardPayment.pay(50000);
		
		System.out.println();
		
		// 계좌이체 결제
		BankTransferPayment bankTransferPayment = new BankTransferPayment();
		bankTransferPayment.pay(30000);
		
		System.out.println();
		
		// Paypal 결제
		PaypalPayment paypalPayment = new PaypalPayment();
		paypalPayment.pay(10000);
		
		
		// 다형성 사용
		PaymentService payment;
		
		payment = new CardPayment();
		payment.pay(50000);
		System.out.println();
		
		payment = new BankTransferPayment();
		payment.pay(30000);
		
		payment = new PaypalPayment();
		payment.pay(20000);
		
	}

}
