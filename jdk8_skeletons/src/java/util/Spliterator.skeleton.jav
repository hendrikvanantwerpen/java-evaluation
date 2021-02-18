package java.util;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public interface Spliterator<T> {
  public interface OfPrimitive<T,T_CONS,T_SPLITR extends Spliterator. OfPrimitive<T, T_CONS, T_SPLITR>> extends Spliterator<T> {
  }
  public interface OfInt extends OfPrimitive<Integer, IntConsumer, OfInt> {
  }
  public interface OfLong extends OfPrimitive<Long, LongConsumer, OfLong> {
  }
  public interface OfDouble extends OfPrimitive<Double, DoubleConsumer, OfDouble> {
  }
}