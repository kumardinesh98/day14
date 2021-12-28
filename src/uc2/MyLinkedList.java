package uc2;

public class MyLinkedList<T> {
	INode <T> head;
	INode <T> tail;

	public void add(INode<T> newNode) {
		head = newNode;
		INode <T> temp = tail;
		tail = head;
		tail.setNext(temp);
	
	}
	public void printMyNodes() {
		System.out.println("My nodes : " + head);
	}
	
	public int size() {
		int count = 0;
		INode <T> tempNode = head;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			count++;
		}
		return count;
	}
	
	@Override
	public String toString() {
		return head.toString();
	}
	
	

}
