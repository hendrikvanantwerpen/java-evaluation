package java.util.function;


public interface Predicate<T> {
  boolean test(T t) ;
  default Predicate<T> and(Predicate<? super T> other) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  default Predicate<T> negate( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  default Predicate<T> or(Predicate<? super T> other) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static <T> Predicate<T> isEqual(Object targetRef) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
}