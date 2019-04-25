package java.lang;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public interface Iterable<T> {
  Iterator<T> iterator( ) ;
  default void forEach(Consumer<? super T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default Spliterator<T> spliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}