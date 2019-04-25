package java.util.function;


public interface LongUnaryOperator {
  long applyAsLong(long operand) ;
  default LongUnaryOperator compose(LongUnaryOperator before) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default LongUnaryOperator andThen(LongUnaryOperator after) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static LongUnaryOperator identity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}