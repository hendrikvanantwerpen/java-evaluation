package java.util.function;


public interface Function<T,R> {
  R apply(T t) ;
  default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  static <T> Function<T, T> identity( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
}