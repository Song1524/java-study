package hw;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg): ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m): ");
		double height = sc.nextDouble();

		double bmi = weight / (height * height);
		System.out.println("BMi 지수: " + bmi);
		System.out.printf("BMi 지수: %.1f\n", bmi);
		System.out.println("BMi 지수: " + (int) (bmi * 10 / 10.0));
		System.out.println("BMi 지수: " + Math.floor(bmi * 10) / 10.0);
	}

}
