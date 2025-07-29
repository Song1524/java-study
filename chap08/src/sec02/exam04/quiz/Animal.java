package sec02.exam04.quiz;

public abstract class Animal {
	private String kind;
	private int leg;
	
	Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}

	public String getKind() {
		return kind;
	}

	public int getLeg() {
		return leg;
	}
	
	abstract void eat();
	
	abstract void sound();
}
