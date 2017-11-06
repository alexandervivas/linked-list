package co.com.vivas.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import co.com.vivas.linkedlist.impl.SimpleList;
import org.junit.Test;

public class LinkedListTest {

  @Test
  public void createSimpleListTest() {

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    assertEquals("new empty list is not being created correctly", 0, linkedList.size());

  }

  @Test
  public void appendNewNodeTest() {

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);

    assertEquals("the linked list is not appending correctly", 1, linkedList.size());

  }

  @Test
  public void removeTailTest() {

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);
    linkedList.append(1990);
    linkedList.append(1991);
    linkedList.append(1992);
    linkedList.append(1993);

    linkedList.removeTail();

    assertEquals("the linked list is not removing the tail correctly", 4, linkedList.size());

  }

  @Test
  public void removeAllTest() {

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);
    linkedList.append(1990);
    linkedList.append(1991);
    linkedList.append(1992);
    linkedList.append(1993);

    linkedList.removeAll();

    assertEquals("the linked list is not removing all elements correctly", 0, linkedList.size());

  }

}
