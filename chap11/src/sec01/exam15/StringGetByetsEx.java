package sec01.exam15;

import java.io.UnsupportedEncodingException;

// 문자열을 바이트 배열로 변환
// 쓰는 경우?
// 1. 파일에 문자열을 바이트로 저장할 때
// 2. 네트워크 전송 시 문자열을 바이트로 변환할 때
// 3. 문자열을 암호화/해시 처리할 때
public class StringGetByetsEx {

	public static void main(String[] args) {
		String str = "안녕하세요.";
		
		// 인코딩: 문자열을 바이트 배열로 바꾸는 과정
		byte[] bytes1 = str.getBytes();	// 시스템의 시본 문자셋을 사용
		System.out.println("bytes1.lenght: " + bytes1.length);
		// 한글 1자를 UTF-8로 인코딩 하면 3바이트가 되고, EUC-KR로 인코딩 하면 2바이트가 됨
		
		// 디코딩: 바잍 배열을 문자열로 다시 복원하는 과정
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str1);
		
		System.out.println("-------------------------------");
		
		try {
			// 특정 문자셋으로 인코딩
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.lenght: " + bytes2.length);
			// 특정 문자셋으로 인코딩
			String str2 = new String(bytes2, "EUC-KR");	// 인코딩 시 사용한 문자셋과 동일
			System.out.println("bytes2 -> String: " + str2);
			
			// 특정 문자셋으로 인코딩
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.lenght: " + bytes3.length);
			// 특정 문자셋으로 인코딩
			String str3 = new String(bytes3, "EUC-KR");	// 인코딩 시 사용한 문자셋과 동일
			System.out.println("bytes3 -> String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}

}
