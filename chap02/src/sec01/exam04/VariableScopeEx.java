package sec01.exam04;

public class VariableScopeEx {

	public static void main(String[] args) {
		int v1 = 15;	// 메인 메소드 안에서 선언
		
		if (v1 > 10) {
			int v2;		// if 불록에서 선언
			v2 = v1 - 10;
			System.out.println("v1: " + v1 + ", v2: " + v2);
		}
		
//		int v3 = v1 + v2 + 5; // 유효 범위를 벗어난 v2 변수를 사용할 수 없음 
	}

}
