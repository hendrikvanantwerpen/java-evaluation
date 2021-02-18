package java.util.concurrent;

import java.util.AbstractList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class CopyOnWriteArrayList<E> implements List<E>, RandomAccess, Cloneable, java. io. Serializable {
  static final class COWIterator<E> implements ListIterator<E> {
  }
  private static class COWSubList<E> extends AbstractList<E> implements RandomAccess {
  }
  private static class COWSubListIterator<E> implements ListIterator<E> {
  }
}