package sec01.exam03;

public interface RemoteControl {
	// 상수 
	int MAX_VOLUME = 10;	// public static final 이 자동으로 추가됨(직접 써줘도 상관 X)
	int MIN_VOLUME = 0;		// 반드시 초기값 설정, 없으면 오류
	
	// 추상 메소드
	// 추상 메소드라서 실행 블록은 없는 상태
	// public abstract 가 자동으로 추가됨(직접 써줘도 상관 X)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}

