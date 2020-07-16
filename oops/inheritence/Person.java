package oops.inheritence;

public class Person {
  protected String name;
    Person(String name){
    	this.name=name;
    	System.out.println("This is the person constructor.");
    }
    protected void eat() {
  	  System.out.println(name+" is eating.");
    }
    protected void walk() {
  	  System.out.println("This guy is walking.");
    }

}
