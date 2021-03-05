package java.util.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

public interface IntStream extends BaseStream<Integer, IntStream> {
  IntStream filter(IntPredicate predicate) ;
  IntStream map(IntUnaryOperator mapper) ;
  <U> Stream<U> mapToObj(IntFunction<? extends U> mapper) ;
  LongStream mapToLong(IntToLongFunction mapper) ;
  DoubleStream mapToDouble(IntToDoubleFunction mapper) ;
  IntStream flatMap(IntFunction<? extends IntStream> mapper) ;
  IntStream distinct( ) ;
  IntStream sorted( ) ;
  IntStream peek(IntConsumer action) ;
  IntStream limit(long maxSize) ;
  IntStream skip(long n) ;
  void forEach(IntConsumer action) ;
  void forEachOrdered(IntConsumer action) ;
  int [] toArray( ) ;
  int reduce(int identity, IntBinaryOperator op) ;
  OptionalInt reduce(IntBinaryOperator op) ;
  <R> R collect(Supplier<R> supplier,ObjIntConsumer<R> accumulator, BiConsumer<R, R> combiner) ;
  int sum( ) ;
  OptionalInt min( ) ;
  OptionalInt max( ) ;
  long count( ) ;
  OptionalDouble average( ) ;
  IntSummaryStatistics summaryStatistics( ) ;
  boolean anyMatch(IntPredicate predicate) ;
  boolean allMatch(IntPredicate predicate) ;
  boolean noneMatch(IntPredicate predicate) ;
  OptionalInt findFirst( ) ;
  OptionalInt findAny( ) ;
  LongStream asLongStream( ) ;
  DoubleStream asDoubleStream( ) ;
  Stream<Integer> boxed( ) ;
  IntStream sequential( ) ;
  IntStream parallel( ) ;
  PrimitiveIterator. OfInt iterator( ) ;
  Spliterator. OfInt spliterator( ) ;
  public static Builder builder( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static IntStream empty( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static IntStream of(int t) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public static IntStream of(int ... values) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public static IntStream iterate(final int seed, final IntUnaryOperator f) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public static IntStream generate(IntSupplier s) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public static IntStream range(int startInclusive, int endExclusive) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public static IntStream rangeClosed(int startInclusive, int endInclusive) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  public static IntStream concat(IntStream a, IntStream b) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public interface Builder extends IntConsumer {
    void accept(int t) ;
    default Builder add(int t) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    IntStream build( ) ;
  }
}