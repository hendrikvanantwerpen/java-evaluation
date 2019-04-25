package java.util;


public class PriorityQueue<E> extends AbstractQueue<E> implements java. io. Serializable {
  public PriorityQueue( ) {
    this(DEFAULT_INITIAL_CAPACITY, null);
  }
  public PriorityQueue(int initialCapacity) {
    this(initialCapacity, null);
  }
  public PriorityQueue(Comparator<? super E> comparator) {
    this(DEFAULT_INITIAL_CAPACITY, comparator);
  }
  public PriorityQueue(int initialCapacity, Comparator<? super E> comparator) {
  }
  @SuppressWarnings("unchecked") public PriorityQueue(Collection<? extends E> c) {
  }
  @SuppressWarnings("unchecked") public PriorityQueue(PriorityQueue<? extends E> c) {
  }
  @SuppressWarnings("unchecked") public PriorityQueue(SortedSet<? extends E> c) {
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean offer(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E peek( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T> T [] toArray(T [] a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E poll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Comparator<? super E> comparator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}