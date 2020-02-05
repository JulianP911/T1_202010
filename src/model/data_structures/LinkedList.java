package model.data_structures;

import java.util.HashSet;
import java.util.Set;
public class LinkedList {
private Node head;
private int size;
public LinkedList(Node head) {
this.head = head;
    size = 1;
  }
public LinkedList() {
this.head = null;
    size = 0;
  }
public Node head() {
return this.head;
  }
public int size() {
return this.size;
  }
public Node search(Object value) {
Node cur = head;
if (head.value() == value) {
return head;
    }
while (cur != null) {
if (cur.value() == value) {
return cur;
      }
      cur = cur.next();
    }
return null;
  }
public void add(Node n) {
if (head == null) {
      head = n;
      size++;
return;
    }
Node cur = head;
while (cur.next() != null) {
      cur = cur.next();
    }
    cur.setNext(n);
    size++;
  }
public void addToFront(Node n) {
Node oldHead = head;
    head = n;
    head.setNext(oldHead);
  }
public void delete(Node n) {
Node nodeInList = search(n.value());
if (nodeInList == null) {
return;
    }
// beginning
if (nodeInList == head) {
      head = head.next();
      size--;
return;
    }
// middle
if (nodeInList.next() != null) {
      nodeInList.setValue(nodeInList.next().value());
Node temp = nodeInList.next();
      nodeInList.setNext(temp.next());
    }
// end
if (nodeInList.next() == null) {
      nodeInList = null;
    }
    size--;
  }
public void remove3rdFromLast() {
if (head == null) {
return;
    }
Node first = head;
Node behind = head;
for (int ind = 0; ind < 2; ind++) {
      first = first.next();
    }
while (first.next() != null) {
      first = first.next();
      behind = behind.next();
    }
    delete(behind);
  }
public void removeDuplicates() {
Node cur = head;
Set<Object> values = new HashSet<Object>();
while (cur != null) {
if(!values.add(cur.value())) {
Node temp = cur;
        delete(cur);
        cur = temp.next();
continue;
      }
      cur = cur.next();
    }
  }
public boolean detectLoop() {
Node tortoise = head;
Node hare = head.next();
if (tortoise == null || hare == null) {
return false;
    }
while (hare.next() != null) {
      tortoise = tortoise.next();
      hare = hare.next().next();
if (tortoise == hare) {
return true;
      }
    }
return false;
  }
@Override
public String toString() {
Node cur = head;
String val = "";
while (cur != null) {
      val += cur.value().toString();
      cur = cur.next();
if (cur != null) {
        val += " -> ";
      }
    }
return val;
  }
}