package uc8;

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
		
		INode<Integer>fourthNode = new MyNode<Integer>(40);
		intLinkedList.insert(30, fourthNode);
		System.out.println("after inserting");
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		intLinkedList.popNode(30);
		System.out.println("after popNode");
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		intLinkedList.pop();
		System.out.println("after pop first node");
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		intLinkedList.popLast();
		System.out.println("after pop last ");
		intLinkedList.printMyNodes();
		System.out.println("size is " + intLinkedList.size());
		
		System.out.println(intLinkedList.search(30));
		
		
	}
}
