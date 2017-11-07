package co.com.vivas.linkedlist.impl;

import co.com.vivas.element.SimpleNode;
import co.com.vivas.linkedlist.LinkedList;
import co.com.vivas.rules.Rule;

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

  public void removeAll(Rule<T> rule) {

    if(head == null) {

      return;

    }

    while(rule.applyRule(head.getElement())) {

      head = head.getNext();

      if(head == null) {

        return;

      }

    }

    SimpleNode<T> beforeCurrent = head;
    SimpleNode<T> current = head.getNext();

    while(current != null) {

      if(rule.applyRule(current.getElement())) {

        current = current.getNext();
        beforeCurrent.setNext(current);

      } else {

        beforeCurrent = current;
        current = current.getNext();

      }

    }

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

  @Override
  public String toString() {

    String value = "";

    try {

      SimpleNode<T> current = head;

      while (current != null) {

        value += ("{ " + current.getElement() + " }, ");
        current = current.getNext();

      }

      if (value.length() > 0) {

        value = value.substring(0, value.length() - 2);

      }
    } catch(Exception e) {
      e.printStackTrace();
    }

    return "[" + value + "]";
  }
}
