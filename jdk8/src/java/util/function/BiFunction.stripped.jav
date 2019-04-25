package java.util.function;


public interface BiFunction<T,U,R> {
  R apply(T t, U u) ;
  default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}