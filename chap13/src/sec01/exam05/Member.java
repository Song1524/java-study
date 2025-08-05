package sec01.exam05;

import java.util.Objects;

public class Member implements Comparable<Member> {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "이름: " + name + " 나이: " + age;
	}

	@Override
	public int compareTo(Member other) {
//		return this.age - other.age;
		if (this.age < other.age) return -1;
		else if (this.age > other.age) return 1;
		else return 0;
	}
	
}
