package sec02.exam04.quiz;

public class Dog extends Animal {

	Dog(String kind, int leg) {
		super(kind, leg);
	}

	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}

	@Override
	void sound() {
		System.out.println("멍멍 짖는다.");
	}

}
