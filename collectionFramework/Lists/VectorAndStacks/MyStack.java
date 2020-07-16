package collectionFramework.Lists.VectorAndStacks;

public class MyStack<E> {
	Node<E> head;
	void push(E data) {
		
		Node<E> toAdd =new Node<>(data);
		if(head==null) {
			head=toAdd;
			return;
		}
	    Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
		
	}
	E peek() throws Exception {
		Node<E> temp=head;
		if(head==null) {
			throw new Exception("Can't peek element from an empty list");
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		return temp.data;
	}
	E pop() throws Exception {
		Node<E> temp=head;
		if(head==null)  {
			throw new Exception("Can't remove last element from an empty list");
		}
		if(temp==null) {
			Node<E> toRemove=head;
			head=null;
			return toRemove.data;
		}
	    while(temp.next.next!=null) {
	    	temp=temp.next;
	    }
	    E data=(E) temp.next.data;
	    temp.next=null;
		return data;
	}
	
	 class Node<E>{
		E data;
		Node next;
		public Node(E data) {
			this.data=data;
			this.next=null;
		}
	}

}
