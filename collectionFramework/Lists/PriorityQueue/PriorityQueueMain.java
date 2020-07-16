package collectionFramework.Lists.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueMain {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(12);
		pq.add(100);
		pq.add(-234);
		pq.add(0);
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		pq.add("Kivi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		
//		System.out.println(pq);
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		

	}

}
