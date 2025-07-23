package sec04.exam05.quiz;

public class Calculator {
	int sum = 0;
	
	public int getEvenTotal(int begin, int end) {
		for (int i = begin; i <= end; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		} return sum;
	} 
	
}
