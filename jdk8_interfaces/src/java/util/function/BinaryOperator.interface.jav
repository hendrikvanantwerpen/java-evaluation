package java.util.function;

import java.util.Comparator;

public interface BinaryOperator<T> extends BiFunction<T, T, T> {
  public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
}