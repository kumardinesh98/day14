package uc1;


public class LinkedList {
	public static void main(String[] args) {
		
		INode<Integer>firstNode = new MyNode<Integer>(100);
		INode<Integer>secondNode = new MyNode<Integer>(160);
		INode<Integer>thirdNode = new MyNode<Integer>(176);
		
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		intLinkedList.add(firstNode);
		intLinkedList.add(secondNode);
		intLinkedList.add(thirdNode);
		
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());

		
	}
}
