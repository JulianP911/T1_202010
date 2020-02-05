package model.data_structures;

public class Node {
private Node next;
private Object value;
public Node(Node next, Object value) {
this.next = next;
this.value = value;
  }
public Node(Object value) {
this.value = value;
this.next = null;
  }
public Node next() {
return this.next;
  }
public Object value() {
return this.value;
  }
public void setNext(Node n) {
this.next = n;
  }
public void setValue(Object value) {
this.value = value;
  }
}
