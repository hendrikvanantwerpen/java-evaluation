package java.util.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

public interface LongStream extends BaseStream<Long, LongStream> {
  LongStream filter(LongPredicate predicate) ;
  LongStream map(LongUnaryOperator mapper) ;
  <U> Stream<U> mapToObj(LongFunction<? extends U> mapper) ;
  IntStream mapToInt(LongToIntFunction mapper) ;
  DoubleStream mapToDouble(LongToDoubleFunction mapper) ;
  LongStream flatMap(LongFunction<? extends LongStream> mapper) ;
  LongStream distinct( ) ;
  LongStream sorted( ) ;
  LongStream peek(LongConsumer action) ;
  LongStream limit(long maxSize) ;
  LongStream skip(long n) ;
  void forEach(LongConsumer action) ;
  void forEachOrdered(LongConsumer action) ;
  long [] toArray( ) ;
  long reduce(long identity, LongBinaryOperator op) ;
  OptionalLong reduce(LongBinaryOperator op) ;
  <R> R collect(Supplier<R> supplier,ObjLongConsumer<R> accumulator, BiConsumer<R, R> combiner) ;
  long sum( ) ;
  OptionalLong min( ) ;
  OptionalLong max( ) ;
  long count( ) ;
  OptionalDouble average( ) ;
  LongSummaryStatistics summaryStatistics( ) ;
  boolean anyMatch(LongPredicate predicate) ;
  boolean allMatch(LongPredicate predicate) ;
  boolean noneMatch(LongPredicate predicate) ;
  OptionalLong findFirst( ) ;
  OptionalLong findAny( ) ;
  DoubleStream asDoubleStream( ) ;
  Stream<Long> boxed( ) ;
  LongStream sequential( ) ;
  LongStream parallel( ) ;
  PrimitiveIterator. OfLong iterator( ) ;
  Spliterator. OfLong spliterator( ) ;
  public static Builder builder( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public static LongStream empty( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public static LongStream of(long t) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public static LongStream of(long ... values) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static LongStream iterate(final long seed, final LongUnaryOperator f) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public static LongStream generate(LongSupplier s) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public static LongStream range(long startInclusive, final long endExclusive) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public static LongStream rangeClosed(long startInclusive, final long endInclusive) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public static LongStream concat(LongStream a, LongStream b) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public interface Builder extends LongConsumer {
    void accept(long t) ;
    default Builder add(long t) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    LongStream build( ) ;
  }
}