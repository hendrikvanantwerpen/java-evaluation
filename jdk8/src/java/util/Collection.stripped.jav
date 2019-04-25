package java.util;

import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Collection<E> extends Iterable<E> {
  int size( ) ;
  boolean isEmpty( ) ;
  boolean contains(Object o) ;
  Iterator<E> iterator( ) ;
  Object [] toArray( ) ;
  <T> T [] toArray(T [] a) ;
  boolean add(E e) ;
  boolean remove(Object o) ;
  boolean containsAll(Collection<?> c) ;
  boolean addAll(Collection<? extends E> c) ;
  boolean removeAll(Collection<?> c) ;
  default boolean removeIf(Predicate<? super E> filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  boolean retainAll(Collection<?> c) ;
  void clear( ) ;
  boolean equals(Object o) ;
  int hashCode( ) ;
  @Override default Spliterator<E> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default Stream<E> stream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default Stream<E> parallelStream( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}