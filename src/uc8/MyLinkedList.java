package uc8;

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
	
	public void pop() {
		head = head.getNext();
	}
	
	public void popLast() {
		INode<T> temp = head;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null);
	}
	
	public INode<T> search(T findKey) {
		INode<T> tempNode = head;
		while (tempNode != null) {
			if(tempNode.getKey() .equals(findKey)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		
		return null;
		
	}
	
	public boolean popNode(T key) {
		
		if (head.equals(key)) {
			head = head.getNext();
			return true;
		}
		INode<T> tempNode = head;
		while (tempNode.getNext() != null) {
			if(tempNode.getNext().getKey() .equals(key)) {
				tempNode.setNext(tempNode.getNext().getNext());
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
