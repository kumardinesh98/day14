package uc5;


public class LinkedList {
	public static void main(String[] args) {
		
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		
		INode<Integer>firstNode = new MyNode<Integer>(56);
		INode<Integer>thirdNode = new MyNode<Integer>(70);
		intLinkedList.add(firstNode);
		intLinkedList.add(thirdNode);
		
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		INode<Integer>secondNode = new MyNode<Integer>(30);
		intLinkedList.insert(56, secondNode);

		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		intLinkedList.pop();
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
	
		
	}
}
