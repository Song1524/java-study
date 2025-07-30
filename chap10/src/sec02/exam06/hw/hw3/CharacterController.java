package sec02.exam06.hw.hw3;

public class CharacterController {
	CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException { 
		int count = 0;
		
		for (int i = 0; i <= s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == ' ') {
				throws new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		
		
		
		
	}
		
}
