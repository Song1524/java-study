package hw.hw2.model.vo;

public class Rectangle {
	
	int width;
	int height;
	
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	
	public int calculateRound(int width, int height) {
		return (width * 2) + (height * 2);
	}
	
	public int calculateArea(int width, int height) {
		return width * height;
	}
	
	public void printInfo() {
		
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사격형의 둘레");
		System.out.println(calculateRound(1, 1) + "cm");
		System.out.println("2. 사격형의 넓이");
		System.out.println(calculateArea(1, 1) + "cm");
		
		System.out.println();
		
		System.out.println("=== 사각형 정보 ===");
		System.out.println("1. 사격형의 둘레");
		System.out.println(calculateRound(3, 5) + "cm");
		System.out.println("2. 사격형의 넓이");
		System.out.println(calculateArea(3, 5) + "cm");
	}
}
