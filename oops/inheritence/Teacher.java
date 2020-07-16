package oops.inheritence;

public class Teacher extends Person {
	public Teacher(String name) {
		super(name);
		System.out.println("this is teachor constructor");
	}

	public void tech() {
		System.out.println(name + " is teaching");
	}

	public void walk() {
		super.walk();
		System.out.println(name + " is walking");
	}

}
