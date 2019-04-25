package java.util.function;


public interface DoublePredicate {
  boolean test(double value) ;
  default DoublePredicate and(DoublePredicate other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default DoublePredicate negate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default DoublePredicate or(DoublePredicate other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}