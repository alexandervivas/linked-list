package co.com.vivas.element;

public class SimpleNode<T> {

  private T element;
  private SimpleNode next;

  public SimpleNode(T element) {

    this.element = element;
    this.next = null;

  }

  public T getElement() {

    return this.element;

  }

  public SimpleNode getNext() {

    return this.next;

  }

  public void setNext(SimpleNode next) {

    this.next = next;

  }

}
