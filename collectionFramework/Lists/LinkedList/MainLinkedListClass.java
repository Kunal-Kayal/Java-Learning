package collectionFramework.Lists.LinkedList;


public class MainLinkedListClass {

	public static void main(String[] args) {
		MyLinkedList<String> myll = new MyLinkedList<>();
		for(int i=0;i<10;i++) {
			myll.add("hi");
		}
		myll.print();

	}
}
