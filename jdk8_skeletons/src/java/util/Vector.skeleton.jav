package java.util;


public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  private class Itr implements Iterator<E> {
  }
  final class ListItr extends Itr implements ListIterator<E> {
  }
  static final class VectorSpliterator<E> implements Spliterator<E> {
  }
}