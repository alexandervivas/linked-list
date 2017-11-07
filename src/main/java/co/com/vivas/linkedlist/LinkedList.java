package co.com.vivas.linkedlist;

import co.com.vivas.rules.Rule;

public interface LinkedList<T> {

  public void append(T element);
  public void removeTail();
  public void removeAll();
  public void removeAll(Rule<T> rule);
  public int size();

}
