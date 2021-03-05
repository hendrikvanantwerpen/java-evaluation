package java.util.function;


public interface IntUnaryOperator {
  int applyAsInt(int operand) ;
  default IntUnaryOperator compose(IntUnaryOperator before) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  default IntUnaryOperator andThen(IntUnaryOperator after) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static IntUnaryOperator identity( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
}