package hw.hw2;

public class Practice {
	String takeState(String input) {
		
		String[] address = input.split(" ");
		String lastGu = null;
		
		for (String add : address) {
			if (add.charAt(add.length() - 1) == '구') {
				lastGu = add;
			}
		}
		return lastGu;
	}
}
