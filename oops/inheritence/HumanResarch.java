package oops.inheritence;


public class HumanResarch {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("Mr. Jaison");
	     Person p =t1;
	     Teacher t = (Teacher)p;
	     t.eat();
	     t1.walk();
	     System.out.println(p instanceof Singer);

	}

}
