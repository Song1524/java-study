package sec03.exam01; 	// 패키지 선언: 해당 소스 파일이 sec03.exam01 패키지 밑에 있음

// 주석 사용하기
// ctrl + / : 전체 한줄 씩 주석
// ctrl + shift + / : 전체 주석

/*
 * 전체 주석
 */

/**
 * 도큐먼트 주석: 도큐먼트 문서 생성하는데 사용
 */

public class Hello {	// 클래스 선언: 클래스 이름은 반드시 대문자로 시작하고 소스 파일의 이름고 동일

	// 프로그램 실행 진입점
	public static void main(String[] args) {	// main 메소드 선언: Java 프로그램 실행 시 가장 먼저 실행되는 메소드

		// 콘솔 출력 실행문
		System.out.println("Hello, Jave"); 
		System.out.println("Hello, Jave"); 
		System.out.println("Hello, Jave"); 
		System.out.println("Hello, Jave"); 
		// 저장울 누를 때 마다 자동으로 컴파일(에라가 있으면 빨간줄 발생)
	}
}