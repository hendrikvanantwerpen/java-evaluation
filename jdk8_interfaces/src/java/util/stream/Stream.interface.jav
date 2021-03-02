package java.util.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public interface Stream<T> extends BaseStream<T, Stream<T>> {
  Stream<T> filter(Predicate<? super T> predicate) ;
  <R> Stream<R> map(Function<? super T, ? extends R> mapper) ;
  IntStream mapToInt(ToIntFunction<? super T> mapper) ;
  LongStream mapToLong(ToLongFunction<? super T> mapper) ;
  DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) ;
  <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) ;
  IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) ;
  LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper) ;
  DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper) ;
  Stream<T> distinct( ) ;
  Stream<T> sorted( ) ;
  Stream<T> sorted(Comparator<? super T> comparator) ;
  Stream<T> peek(Consumer<? super T> action) ;
  Stream<T> limit(long maxSize) ;
  Stream<T> skip(long n) ;
  void forEach(Consumer<? super T> action) ;
  void forEachOrdered(Consumer<? super T> action) ;
  Object [] toArray( ) ;
  <A> A [] toArray(IntFunction<A []> generator) ;
  T reduce(T identity, BinaryOperator<T> accumulator) ;
  Optional<T> reduce(BinaryOperator<T> accumulator) ;
  <U> U reduce(U identity,BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner) ;
  <R> R collect(Supplier<R> supplier,BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner) ;
  <R,A> R collect(Collector<? super T, A, R> collector) ;
  Optional<T> min(Comparator<? super T> comparator) ;
  Optional<T> max(Comparator<? super T> comparator) ;
  long count( ) ;
  boolean anyMatch(Predicate<? super T> predicate) ;
  boolean allMatch(Predicate<? super T> predicate) ;
  boolean noneMatch(Predicate<? super T> predicate) ;
  Optional<T> findFirst( ) ;
  Optional<T> findAny( ) ;
  public static <T> Builder<T> builder( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public static <T> Stream<T> empty( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public static <T> Stream<T> of(T t) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public static <T> Stream<T> of(T ... values) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public static <T> Stream<T> iterate(final T seed, final UnaryOperator<T> f) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  public static <T> Stream<T> generate(Supplier<T> s) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  public interface Builder<T> extends Consumer<T> {
    void accept(T t) ;
    default Builder<T> add(T t) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    Stream<T> build( ) ;
  }
}