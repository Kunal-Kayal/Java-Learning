package string;

public class OperationOnString {

	public static void main(String[] args) {
		String name1 = "Kunal Kayal";
		String name2 = "Kushal Kayal";
		System.out.println("The name " + name1);
		System.out.println("the operation: " + name1.charAt(3));
		System.out.println("the lenght" + name1.length());
		System.out.println("subsstring: " + name1.substring(5));
		System.out.println("Subsstring: " + name1.substring(5, 9));
		System.out.println("bollean: " + name1.contains("Kunal"));
		System.out.println("boolean: " + name1.equals(name2));
		System.out.println("bollean: " + name1.isEmpty());
		System.out.println("string: " + name1.concat(" Kunal"));
		System.out.println("Strong: " + name2.replace("Kayal", "Kunal"));
		System.out.println(name1 + name2);
	}

}
