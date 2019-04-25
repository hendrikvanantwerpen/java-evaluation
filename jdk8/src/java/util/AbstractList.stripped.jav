package java.util;


public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
  protected AbstractList( ) {
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public E get(int index) ;
  public E set(int index, E element) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(int index, E element) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E remove(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int indexOf(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lastIndexOf(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(int index, Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ListIterator<E> listIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ListIterator<E> listIterator(final int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<E> subList(int fromIndex, int toIndex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}