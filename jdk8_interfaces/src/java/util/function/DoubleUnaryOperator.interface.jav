package java.util.function;


public interface DoubleUnaryOperator {
  double applyAsDouble(double operand) ;
  default DoubleUnaryOperator compose(DoubleUnaryOperator before) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  default DoubleUnaryOperator andThen(DoubleUnaryOperator after) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  static DoubleUnaryOperator identity( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
}