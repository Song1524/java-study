package sec03.exam03.Quiz;

public class Animal {
	
	String kind;
	int age;
	
	Animal(String kind, int age) {
		this.kind = kind;
		this.age = age;
	}
	
	Animal(String kind) {
		this.kind = kind;
		age = 1;
	}
	
	Animal(int age) {
		this.age = age;	
		kind = "사람";
	}

    public void info() {
        System.out.println(kind + ": " + age + "살");
    }
}
