package oops.inheritence;

public class Singer extends Person {
	 Singer(String name) {
		super(name);
		System.out.println("This is the singer construtor");
	}

	public void sing()
	 {
		 System.out.println(name+" is singing");
	 }
}
