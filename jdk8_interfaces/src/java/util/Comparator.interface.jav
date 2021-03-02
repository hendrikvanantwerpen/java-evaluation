package java.util;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.ToDoubleFunction;

public interface Comparator<T> {
  int compare(T o1, T o2) ;
  boolean equals(Object obj) ;
  default Comparator<T> reversed( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  default Comparator<T> thenComparing(Comparator<? super T> other) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  default <U> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                              }
  default <U extends Comparable<? super U>> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor) {
                                                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                       }
  default Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  default Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  default Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  public static <T extends Comparable<? super T>> Comparator<T> reverseOrder( ) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public static <T extends Comparable<? super T>> Comparator<T> naturalOrder( ) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public static <T> Comparator<T> nullsFirst(Comparator<? super T> comparator) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public static <T> Comparator<T> nullsLast(Comparator<? super T> comparator) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public static <T,U> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
                                                                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                  }
  public static <T,U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor) {
                                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                           }
  public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  public static <T> Comparator<T> comparingLong(ToLongFunction<? super T> keyExtractor) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  public static <T> Comparator<T> comparingDouble(ToDoubleFunction<? super T> keyExtractor) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
}