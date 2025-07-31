package sec01.exam06;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("구글", "안드로이드");
		
		System.out.println(phone);
		
		String strObj = phone.toString();
		System.out.println(strObj);
	}

}
