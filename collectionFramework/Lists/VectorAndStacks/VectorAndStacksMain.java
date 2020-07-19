package collectionFramework.Lists.VectorAndStacks;

import java.util.Arrays;
import java.util.Stack;

public class VectorAndStacksMain {

	public static void main(String[] args)  {
	Stack<Integer> st =new Stack<>();
	
		st.add(23);
		st.add(12);
		st.add(45);
		int arr[]= new int[st.size()];
		st.toArray(int arr[]);
		Arrays.sort(st);
		System.out.println(st);


	}

}
