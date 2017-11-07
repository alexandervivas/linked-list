package co.com.vivas.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import co.com.vivas.linkedlist.impl.SimpleList;
import co.com.vivas.rules.Rule;
import org.junit.Test;

public class LinkedListTest {

  @Test
  public void createSimpleListTest() {
    System.out.println("Running createSimpleListTest...");

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    System.out.println(linkedList);

    assertEquals("new empty list is not being created correctly", 0, linkedList.size());

  }

  @Test
  public void appendNewNodeTest() {
    System.out.println("Running appendNewNodeTest...");

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);

    System.out.println(linkedList);

    assertEquals("the linked list is not appending correctly", 1, linkedList.size());

  }

  @Test
  public void removeTailTest() {
    System.out.println("Running removeTailTest...");

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);
    linkedList.append(1990);
    linkedList.append(1991);
    linkedList.append(1992);
    linkedList.append(1993);

    System.out.println(linkedList);

    linkedList.removeTail();

    System.out.println(linkedList);

    assertEquals("the linked list is not removing the tail correctly", 4, linkedList.size());

  }

  @Test
  public void removeAllTest() {
    System.out.println("Running removeAllTest...");

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);
    linkedList.append(1990);
    linkedList.append(1991);
    linkedList.append(1992);
    linkedList.append(1993);

    System.out.println(linkedList);

    linkedList.removeAll();

    System.out.println(linkedList);

    assertEquals("the linked list is not removing all elements correctly", 0, linkedList.size());

  }

  @Test
  public void removeAllWithRuleTest() {
    System.out.println("Running removeAllWithRuleTest...");

    Rule<Integer> rule = new Rule<Integer>() {
      public boolean applyRule(Integer a) {
        return a < 1991;
      }
    };

    LinkedList<Integer> linkedList = new SimpleList<Integer>();

    linkedList.append(1989);
    linkedList.append(1990);
    linkedList.append(1991);
    linkedList.append(1992);
    linkedList.append(1993);

    System.out.println(linkedList);

    linkedList.removeAll(rule);

    System.out.println(linkedList);

    assertEquals("the linked list is not removing all elements based on the rule correctly", 3, linkedList.size());

  }

}
