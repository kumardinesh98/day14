package uc8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTest {
	
	INode<Integer> firstNode = new MyNode<Integer>(56);
	INode<Integer> secondNode = new MyNode<Integer>(30);
	INode<Integer> thirdNode = new MyNode<Integer>(70);

	MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();


	@Test
	public void searchInLinkedList() {
		
		intLinkedList.add(firstNode);
		intLinkedList.add(secondNode);
		intLinkedList.add(thirdNode);		
		assertEquals(secondNode,intLinkedList.search(30));
	}
	
	@Test
	public void insertTest() {
		intLinkedList.add(firstNode);
		intLinkedList.add(secondNode);
		intLinkedList.add(thirdNode);		
		INode<Integer> fourthNode = new MyNode<Integer>(40);

		assertEquals(true,intLinkedList.insert(30,fourthNode));

	}
	
	@Test
	public void popNode() {
		intLinkedList.add(firstNode);
		intLinkedList.add(secondNode);
		intLinkedList.add(thirdNode);		
		assertEquals(false,intLinkedList.popNode(90));

	}
	
}
