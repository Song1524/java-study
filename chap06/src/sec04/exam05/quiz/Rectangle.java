package sec04.exam05.quiz;

public class Rectangle {
	
	int width;
	int height;
	int result = 0;
	

	public void area() {
		result = width * height;
		System.out.println("면적: " + result);
	}

	public void length() {
		result = width * 2  + height * 2;
		System.out.println("둘레: " + result);
	}

}
