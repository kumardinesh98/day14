package uc7;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTest {
	

	@Test
	public void searchInLinkedList() {
		INode<Integer> firstNode = new MyNode<Integer>(56);
		INode<Integer> secondNode = new MyNode<Integer>(30);
		INode<Integer> thirdNode = new MyNode<Integer>(70);

		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();

		intLinkedList.add(firstNode);
		intLinkedList.add(secondNode);
		intLinkedList.add(thirdNode);		
		assertEquals(secondNode,intLinkedList.search(30));
	}
}
