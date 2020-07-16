package collectionFramework.Lists.Deque;


public class DequeMain {

	public static void main(String[] args) {
		Mydeque<Integer> dq = new Mydeque<>();
		dq.addToHead(34);
		dq.addToHead(45);
		dq.addToHead(56);
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());
		System.out.println(dq.removeLast());

	}

}
