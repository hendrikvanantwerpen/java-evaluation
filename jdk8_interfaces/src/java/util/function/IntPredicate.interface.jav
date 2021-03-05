package java.util.function;


public interface IntPredicate {
  boolean test(int value) ;
  default IntPredicate and(IntPredicate other) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  default IntPredicate negate( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  default IntPredicate or(IntPredicate other) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
}