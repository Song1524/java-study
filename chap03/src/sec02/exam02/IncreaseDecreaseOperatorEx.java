package sec02.exam02;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("-----------------------");
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println("-----------------------");
		y--;
		--y;
		System.out.println("y = " + y);
		
		// 다른 연산자랑 같이 쓸때
		System.out.println("-----------------------");
		// 후위 연산자는 값을 먼저 사용한 뒤 증감시키는 연산자
		z = x++;
		System.out.println(z);
		System.out.println(x);
		
		// 전위 연산자는 값을 먼저 증감 시킨 뒤 사용하는 연산자
		System.out.println("-----------------------");
		z = ++x;
		System.out.println(z);
		System.out.println(x);
		
		System.out.println("-----------------------");
		z = ++x + y++;	// 15 + 8 = 23
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("-----------------------");
		// Quiz
		// 다음 코드 실행 후 x의 값은?
		x = 3;
		if (x++ == 3) {			// x = 3
			x++;				// x = 4
		}
		System.out.println(x);	// x = 5
		
		System.out.println("-----------------------");
		// 다음 코드 실행 후 x, y의 값은?
		x = 1;
		y = x++ + ++x + x; // 1 + 3 + 3 = 7
		
		System.out.println(x);	// x = 3
		System.out.println(y);	// y = 7
		
		System.out.println("-----------------------");
		int a = 10;
		int b = 20;
		int c = (++a) + (b--);
		System.out.println(c);
		
	}

}
