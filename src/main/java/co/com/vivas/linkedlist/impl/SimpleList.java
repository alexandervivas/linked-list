package co.com.vivas.linkedlist.impl;

import co.com.vivas.element.SimpleNode;
import co.com.vivas.linkedlist.LinkedList;

public class SimpleList<T> implements LinkedList<T> {

  private SimpleNode<T> head;

  public SimpleList() {

    head = null;

  }

  public void append(T element) {

    if(head == null) {

      head = new SimpleNode(element);
      return;

    }

    SimpleNode<T> node = head;

    while(node.getNext() != null) {

      node = node.getNext();

    }

    node.setNext(new SimpleNode<T>(element));

  }

  public void removeTail() {

    // empty linked list
    if(head == null) {

      return;

    }

    // there is only one element in the linked list
    if(head.getNext() == null) {

      head = null;
      return;

    }

    // the rest of cases
    SimpleNode<T> nodeBeforeTail = head;
    SimpleNode<T> tail = head.getNext();

    while(tail.getNext() != null) {

      nodeBeforeTail = tail;
      tail = tail.getNext();

    }

    nodeBeforeTail.setNext(null);

  }

  public void removeAll() {

    head = null;

  }

  public int size() {

    int size = 0;

    SimpleNode<T> node = head;

    while(node != null) {

      size++;
      node = node.getNext();

    }

    return size;

  }
}
