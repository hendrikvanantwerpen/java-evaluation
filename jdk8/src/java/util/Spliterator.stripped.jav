package java.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public interface Spliterator<T> {
  boolean tryAdvance(Consumer<? super T> action) ;
  default void forEachRemaining(Consumer<? super T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  Spliterator<T> trySplit( ) ;
  long estimateSize( ) ;
  default long getExactSizeIfKnown( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  int characteristics( ) ;
  default boolean hasCharacteristics(int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default Comparator<? super T> getComparator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int ORDERED
  ;
  public static final int DISTINCT
  ;
  public static final int SORTED
  ;
  public static final int SIZED
  ;
  public static final int NONNULL
  ;
  public static final int IMMUTABLE
  ;
  public static final int CONCURRENT
  ;
  public static final int SUBSIZED
  ;
  public interface OfPrimitive<T,T_CONS,T_SPLITR extends Spliterator. OfPrimitive<T, T_CONS, T_SPLITR>> extends Spliterator<T> {
    @Override T_SPLITR trySplit( ) ;
    @SuppressWarnings("overloads") boolean tryAdvance(T_CONS action) ;
    @SuppressWarnings("overloads") default void forEachRemaining(T_CONS action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public interface OfInt extends OfPrimitive<Integer, IntConsumer, OfInt> {
    @Override OfInt trySplit( ) ;
    @Override boolean tryAdvance(IntConsumer action) ;
    @Override default void forEachRemaining(IntConsumer action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default boolean tryAdvance(Consumer<? super Integer> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default void forEachRemaining(Consumer<? super Integer> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public interface OfLong extends OfPrimitive<Long, LongConsumer, OfLong> {
    @Override OfLong trySplit( ) ;
    @Override boolean tryAdvance(LongConsumer action) ;
    @Override default void forEachRemaining(LongConsumer action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default boolean tryAdvance(Consumer<? super Long> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default void forEachRemaining(Consumer<? super Long> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public interface OfDouble extends OfPrimitive<Double, DoubleConsumer, OfDouble> {
    @Override OfDouble trySplit( ) ;
    @Override boolean tryAdvance(DoubleConsumer action) ;
    @Override default void forEachRemaining(DoubleConsumer action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default boolean tryAdvance(Consumer<? super Double> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    @Override default void forEachRemaining(Consumer<? super Double> action) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}