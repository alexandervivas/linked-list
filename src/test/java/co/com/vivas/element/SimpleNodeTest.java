package co.com.vivas.element;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleNodeTest {

  @Test
  public void createSimpleNodeTest() {

    SimpleNode<Integer> node = new SimpleNode<Integer>(1989);

    assertEquals("The node element is not equals to the actual element", new Integer(1989), node.getElement());

  }

  @Test
  public void setNextSimpleNodeTest() {

    SimpleNode<Integer> node = new SimpleNode<Integer>(1989);

    SimpleNode<Integer> next = new SimpleNode<Integer>(2017);

    node.setNext(next);

    assertEquals("The next node is not equals to the actual inserted node", new Integer(2017), node.getNext().getElement());

  }

}
