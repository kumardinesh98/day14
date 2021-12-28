package uc2;


public class LinkedList {
	public static void main(String[] args) {
		
		INode<Integer>firstNode = new MyNode<Integer>(70);
		
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		intLinkedList.add(firstNode);		
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());

		INode<Integer>secondNode = new MyNode<Integer>(30);
		intLinkedList.add(secondNode);
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		INode<Integer>thirdNode = new MyNode<Integer>(56);
		intLinkedList.add(thirdNode);
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());


	}
}
