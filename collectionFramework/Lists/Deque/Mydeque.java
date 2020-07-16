package collectionFramework.Lists.Deque;

public class Mydeque<E> {
	Node<E> head,tail;
	public void addToHead( E data) {
		Node<E> toAdd = new Node<>(data);
		if(head==null) {
			head=tail=toAdd;
			return;
		}
		head.next=toAdd;
		toAdd.prev=head;
	     
		
	}
	public E removeLast() {
		if(head==null) {
			return null;
		}
		Node<E> toRm=tail;
		tail=tail.next;
		E data = toRm.data;
		toRm=null;
		if(tail==null) {
			head=null;
		}
		return data;
	}
	
	
	
	public static class Node<E>{
		E data;
		Node next,prev;
		public Node(E data) {
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	

}
