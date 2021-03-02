package java.util.function;


public interface DoubleConsumer {
  void accept(double value) ;
  default DoubleConsumer andThen(DoubleConsumer after) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
}