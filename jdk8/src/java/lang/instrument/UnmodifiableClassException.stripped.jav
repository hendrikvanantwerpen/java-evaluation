package java.lang.instrument;


public class UnmodifiableClassException extends Exception {
  public UnmodifiableClassException( ) {
    super( );
  }
  public UnmodifiableClassException(String s) {
    super(s);
  }
}