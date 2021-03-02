package java.util.function;


public interface Consumer<T> {
  void accept(T t) ;
  default Consumer<T> andThen(Consumer<? super T> after) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
}