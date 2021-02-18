package java.util;


public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  private class Itr implements Iterator<E> {
  }
  private class ListItr extends Itr implements ListIterator<E> {
  }
  private class SubList extends AbstractList<E> implements RandomAccess {
  }
  static final class ArrayListSpliterator<E> implements Spliterator<E> {
  }
}