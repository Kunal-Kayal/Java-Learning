package collectionFramework.Set;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		Set<String> fruits = new TreeSet<>();
//		fruits.add("Banana");
//		fruits.add("Apple");
//		fruits.add("kivi");
		Set<Integer> x = new HashSet<Integer>();
		x.add(7);
		x.add(3);
		x.add(9);
		
		Set<Integer> y = new HashSet<Integer>();
		y.add(7);
		y.add(3);
		y.add(89);
		
//		x.addAll(y);
//		x.retainAll(y);
		
		System.out.println(x.contains(3));
	}

}
