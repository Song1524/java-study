package sec02.exam04;

public class CharEx {

	public static void main(String[] args) {
		// char(2byte)
		// 하나의 문자를 유니코드로 저장
		// 유니코드: 세계 각국의 문자들을 2byte(0 ~ 65535) 범위메 매핑한 국제 표준 규약
		
		char c1 = 'A';		// 실제로는 유니코드 값인 65가 메모리에 저장됨
		char c2 = 65;		
//		char cc = '-65';	// 음수값은 저장 안됨, 유니코드는 0부터 시작
		char c3 = '\u0041';	// 유니코드를 의미 + 16진수
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println("-------------------------------");
		
		char c4 = '가';		
		char c5 = 44032;		
		char c6 = '\uAC00';	
		
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		// (참고) 유니코드 값 알아내기
		char var = '각';
		int unicode = var;
		
		System.out.println(unicode);
		
		// (참고) 문자를 숫자로 변환
		// 문자 '0' -> 유니코드 48
		System.out.println('1' - 0);	// 49 - 0
		System.out.println('1' - '0');	// 49 - 48
		
		// 이런 방식은 문자를 숫자로 변환할 때 쓰일 수 있음
		char digit = '8';
		int numbericValue = digit - '0';
		System.out.println(numbericValue);
		
		/*
		 * 중요
		 * 1) 문자와 문자열은 다름
		 * 2) 빈 문자 처리에 대해 
		 */
//		char c = '';		// 컴파일 에러
		char c = ' ';		// 공백은 가능, 공백 문자는 유니코드(32)에 존재하기 때문
		System.out.println((int) ' ');
		String str = "";	// 빈 문자열은 가능
		
		System.out.println("-------------------------------");
		
		// 유니코드로 이름 출력하기
		
		char s1 = '송';
        char s2 = '진';
        char s3 = '영';

        System.out.println("송: " + (int) s1); 
        System.out.println("진: " + (int) s2); 
        System.out.println("영: " + (int) s3);
		
		char u1 = 49569;	// 송
		char u2 = 51652;	// 진
		char u3 = 50689;	// 영
		
		System.out.print(u1);
		System.out.print(u2);
		System.out.println(u3);
		
		
	}

}
