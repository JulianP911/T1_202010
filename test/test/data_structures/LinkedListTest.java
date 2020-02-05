package test.data_structures;

import static org.junit.Assert.*;
import model.data_structures.*;

import org.junit.Test;

public class LinkedListTest 
{
	
	@Test
	public void testAddSetsHeadProperly() {
	Node n = new Node(1);
	LinkedList list = new LinkedList(n);
	    assertEquals(n, list.head());
	  }
	@Test
	public void testAddWorksWithTwoElements() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(3);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    list.add(n3);
	    assertEquals(n, list.head());
	    assertEquals(n2, list.head().next());
	    assertEquals(n3, list.head().next().next());
	  }
	@Test
	public void testAddWorksWithNElements() {
	LinkedList list = new LinkedList();
	for (int ind = 0; ind < 10; ind++) {
	Node n = new Node(ind);
	      list.add(n);
	    }
	  }
	@Test
	public void testSearch() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    assertEquals(n, list.search(1));
	    assertEquals(n2, list.search(2));
	    assertEquals(null, list.search(1000));
	  }
	@Test
	public void testDeleteHead() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    assertEquals(n, list.head());
	    list.delete(n);
	    assertEquals(n2, list.head());
	    assertEquals(null, list.search(n));
	  }
	@Test
	public void testDeleteMiddle() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(3);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    list.add(n3);
	    assertEquals(n2, list.head().next());
	    list.delete(n2);
	    assertEquals(n3.value(), list.head().next().value());
	  }
	@Test
	public void testDeleteEnd() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(3);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    list.add(n3);
	    assertEquals(n3, list.head().next().next());
	    list.delete(n3);
	    assertEquals(n2, list.head().next());
	  }
	@Test
	public void testRemoveThirdFromLast() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(3);
	Node n4 = new Node(4);
	Node n5 = new Node(5);
	Node n6 = new Node(6);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    list.add(n3);
	    list.add(n4);
	    list.add(n5);
	    list.add(n6);
	    list.remove3rdFromLast();
	    assertNull(list.search(n4));
	  }
	@Test
	public void testRemoveDuplicates() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(1);
	Node n4 = new Node(4);
	Node n5 = new Node(5);
	Node n6 = new Node(5);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    list.add(n3);
	    list.add(n4);
	    list.add(n5);
	    list.add(n6);
	    assertEquals(6, list.size());
	    list.removeDuplicates();
	    assertEquals(4, list.size());
	  }
	@Test
	public void testCycle() {
	Node n = new Node(1);
	Node n2 = new Node(2);
	Node n3 = new Node(1);
	Node n4 = new Node(4);
	Node n5 = new Node(5);
	Node n6 = new Node(5);
	LinkedList list = new LinkedList(n);
	    list.add(n2);
	    list.add(n3);
	    list.add(n4);
	    list.add(n5);
	    list.add(n6);
	    assertFalse(list.detectLoop());
	LinkedList list2 = new LinkedList(n);
	    list.addToFront(n2);
	    list.addToFront(n);
	    assertTrue(list2.detectLoop());
	  }


}
