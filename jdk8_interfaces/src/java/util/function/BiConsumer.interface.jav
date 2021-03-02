package java.util.function;


public interface BiConsumer<T,U> {
  void accept(T t, U u) ;
  default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
}