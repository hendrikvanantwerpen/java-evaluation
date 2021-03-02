package java.util;


public interface SortedSet<E> extends Set<E> {
  Comparator<? super E> comparator( ) ;
  SortedSet<E> subSet(E fromElement, E toElement) ;
  SortedSet<E> headSet(E toElement) ;
  SortedSet<E> tailSet(E fromElement) ;
  E first( ) ;
  E last( ) ;
  default Spliterator<E> spliterator( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
}