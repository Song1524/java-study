package hw.hw6;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		String[] word = sentence.split(" ");
		
		System.out.print("단어를 입력하세요: ");
		String input = sc.nextLine();
		
		
		for (int i = 0; i < word.length; i++) {
			
			if (word[i].equals(input)) {
				if (i == word.length - 1) {
					System.out.println("마지막 단어입니다.");
				} else {					
					System.out.println(input + " 다음 단어: " + word[i + 1] );
				} return;
			} 
		}
		System.out.println("존재하지 않는 단어입니다.");
	}
}
