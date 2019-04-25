package java.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public interface PrimitiveIterator<T,T_CONS> extends Iterator<T> {
  @SuppressWarnings("overloads") void forEachRemaining(T_CONS action) ;
  public static interface OfInt extends PrimitiveIterator<Integer, IntConsumer> {
    int nextInt( ) ;
    default void forEachRemaining(IntConsumer action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default Integer next( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default void forEachRemaining(Consumer<? super Integer> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static interface OfLong extends PrimitiveIterator<Long, LongConsumer> {
    long nextLong( ) ;
    default void forEachRemaining(LongConsumer action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default Long next( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default void forEachRemaining(Consumer<? super Long> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static interface OfDouble extends PrimitiveIterator<Double, DoubleConsumer> {
    double nextDouble( ) ;
    default void forEachRemaining(DoubleConsumer action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default Double next( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default void forEachRemaining(Consumer<? super Double> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}