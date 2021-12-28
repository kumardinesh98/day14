package uc4;

public class MyLinkedList<T> {
	INode <T> head;
	INode <T> tail;

	public void add(INode<T> newNode) {
		if (head == null) {
			head = newNode;
		}
		if (tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
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
	
	public boolean insert(T key, INode<T> newNode) {
		INode<T> tempNode = head;
		while (tempNode != null) {
			if(tempNode.getKey() .equals(key)) {
				INode<T> temporary = tempNode.getNext();
				tempNode.setNext(newNode);
				newNode.setNext(temporary);
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}
	
	@Override
	public String toString() {
		return head.toString();
	}
	
	
	
	

}
