package java.util;


public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
  private class Itr implements Iterator<E> {
  }
  private class ListItr extends Itr implements ListIterator<E> {
  }
}
class SubList<E> extends AbstractList<E> {
}
class RandomAccessSubList<E> extends SubList<E> implements RandomAccess {
}