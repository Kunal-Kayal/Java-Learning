package collectionFramework.Lists.Queue;


public class QueueMainClass {

	public static void main(String[] args)  {
		MyQueue<Integer> q = new MyQueue<>();
		q.enqueue(12);
		q.enqueue(34);
		q.enqueue(45);
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		System.out.println(q.dqueue());
		q.enqueue(345);
		System.out.println(q.peek());
		System.out.println(q.dqueue());
		
		
		

	}

}
