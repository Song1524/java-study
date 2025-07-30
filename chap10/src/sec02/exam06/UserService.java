package sec02.exam06;

public class UserService {
	public void registerUser(int age) throws InvalidAgeExcepsion {
		if (age < 0) {
			// throw: 예외 발생 시키기
			throw new InvalidAgeExcepsion("나이는 0보다 작을 수 없습니다.");	// 예외 메시지 작성
			// 참고: 만약 InvalidInputExcepsion 처럼 예외를 범용적으로 만들면
			// 메시지를 통해 무슨 오류인지 명확하게 표현할 수 있음
		}
		
		System.out.println("사용자 등록 완료 (나이: " + age +  ")");
	}
}
