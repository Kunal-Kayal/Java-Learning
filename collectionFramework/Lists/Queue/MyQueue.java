package collectionFramework.Lists.Queue;

import collectionFramework.Lists.LinkedList.MyLinkedList.Node;

public class MyQueue <E>{
	private Node<E> head,rear;
	public void enqueue(E e) {
		Node<E> toAdd =new Node (e);
		if(head==null) {
			head=rear=toAdd;
			return;
		}
		else {
			rear.next=toAdd;
			rear=rear.next;
			return;
		}
	}
	public E dqueue() {
		if(head==null) {
			return null;
		}
		Node<E> temp =head;
		head=head.next;

		if(head==null) {
			rear=null;
		}
		return temp.data;
		
	}
	public E peek() {
		return head.data;
	}

}
