package collectionFramework.Lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Introduction {

	public static void main(String[] args) {
		List<String> objects = new ArrayList();//<>-->generic
		objects.add("Hello");
		objects.add("K2");
		objects.add("bye");
//		String temp[] = new String[objects.size()];
//		objects.toArray(temp);
		for(String e:objects) {
			System.out.print(e+" ");}

//		System.out.println(objects.size());
//		System.out.println(objects.contains("K"));
//		System.out.println(objects.contains("K2"));
//		System.out.println(objects.contains(objects.isEmpty()));
		
//		objects.clear();
//		List<String> toRemove =new ArrayList<String>();
//		toRemove.add("K2");
//		toRemove.add("bye");
//		objects.removeAll(toRemove);
//		System.out.println(objects);
//		objects.remove(0);
		//objects.set(1,"Kunal");
		//System.out.println(objects);
		
//		List<String> abject1=new ArrayList();
//		abject1.add("GoalGappa");
//		abject1.add("chop");
//		objects.addAll(abject1);
		Pair<String,Integer> p1 = new Pair("Kunal",123);
//		System.out.println(p1.x);
//		Pair<Boolean,Integer> p2 = new Pair(true,123);
//		System.out.println(p2.y);
//		Double x =3.45;
		//objects.add(1,"Kunal");
		//System.out.println(objects);
		//System.out.println(objects.get(1));
	}

}
