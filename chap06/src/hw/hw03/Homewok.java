package hw.hw03;

public class Homewok {
	String sumString;
	int times = 0;
	
	public String str(String str1, String str2) {
		sumString = str1 + str2;
		System.out.println(sumString);
		return sumString;
	}
	
	public int num(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			times = num1 * num2;
			System.out.println(times);
			return times;			
		}
	}
	
	public boolean strCom(String str3, String str4) {
		if (str3.equals(str4)) {
			System.out.println(true);
			return true;
		} else {
		System.out.println(false);
		return false;
		}
	}
}
