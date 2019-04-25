package java.util.stream;

import java.util.Spliterator;
import java.util.function.Supplier;

public final class StreamSupport {
  private StreamSupport( ) {
  }
  public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Stream<T> stream(Supplier<? extends Spliterator<T>> supplier,int characteristics, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static IntStream intStream(Spliterator. OfInt spliterator, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static IntStream intStream(Supplier<? extends Spliterator. OfInt> supplier,int characteristics, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LongStream longStream(Spliterator. OfLong spliterator, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static LongStream longStream(Supplier<? extends Spliterator. OfLong> supplier,int characteristics, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DoubleStream doubleStream(Spliterator. OfDouble spliterator, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DoubleStream doubleStream(Supplier<? extends Spliterator. OfDouble> supplier,int characteristics, boolean parallel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}