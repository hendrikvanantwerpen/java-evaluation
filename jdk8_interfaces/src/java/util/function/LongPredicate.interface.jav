package java.util.function;


public interface LongPredicate {
  boolean test(long value) ;
  default LongPredicate and(LongPredicate other) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  default LongPredicate negate( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  default LongPredicate or(LongPredicate other) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
}