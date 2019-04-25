package java.util;


public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, java. io. Serializable {
  TreeSet(NavigableMap<E, Object> m) {
  }
  public TreeSet( ) {
    this(new TreeMap <E, Object>( ));
  }
  public TreeSet(Comparator<? super E> comparator) {
    this(new TreeMap <>(comparator));
  }
  public TreeSet(Collection<? extends E> c) {
    this( );
  }
  public TreeSet(SortedSet<E> s) {
    this(s. comparator( ));
  }
  public Iterator<E> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<E> descendingIterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<E> descendingSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean add(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(Collection<? extends E> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<E> subSet(E fromElement,boolean fromInclusive,E toElement, boolean toInclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<E> headSet(E toElement, boolean inclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public NavigableSet<E> tailSet(E fromElement, boolean inclusive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SortedSet<E> subSet(E fromElement, E toElement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SortedSet<E> headSet(E toElement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SortedSet<E> tailSet(E fromElement) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Comparator<? super E> comparator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E first( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E last( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E lower(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E floor(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E ceiling(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E higher(E e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pollFirst( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public E pollLast( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}