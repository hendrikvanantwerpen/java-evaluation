package java.util;

import java.util.function.Consumer;

public interface Iterator<E> {
  boolean hasNext( ) ;
  E next( ) ;
  default void remove( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  default void forEachRemaining(Consumer<? super E> action) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
}