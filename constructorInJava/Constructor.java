package constructorInJava;

class ball{
	String name,colour;
	ball(String nm,String colour){
		this.colour = colour;
//		name = nm;
		System.out.println("This is a "+colour+" "+nm);
	}
}
public class Constructor {

	public static void main(String[] args) {
//		String name = "Footbal";
//		String col ="Grey";
		ball bal_1 = new ball("Football","Grey");

	}

}
