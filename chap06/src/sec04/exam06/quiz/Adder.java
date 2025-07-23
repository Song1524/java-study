package sec04.exam06.quiz;

public class Adder {
	int sum = 0;
	double sum1 = 0;

	public int add(int n1, int n2) {
		sum = n1 + n2;
		return sum;
	}
	
	public double add(double n3, double n4) {
		sum1 = (double) (n3 + n4);
		return sum1;
	}

}
