package uc6;


public class LinkedList {
	public static void main(String[] args) {
		
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		
		INode<Integer>firstNode = new MyNode<Integer>(56);
		INode<Integer>secondNode = new MyNode<Integer>(30);
		INode<Integer>thirdNode = new MyNode<Integer>(70);
		
		intLinkedList.add(firstNode);
		intLinkedList.add(secondNode);
		intLinkedList.add(thirdNode);

		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		intLinkedList.popLast();
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
	}
}
