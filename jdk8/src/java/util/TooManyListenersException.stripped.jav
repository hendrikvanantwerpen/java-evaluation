package java.util;


public class TooManyListenersException extends Exception {
  public TooManyListenersException( ) {
    super( );
  }
  public TooManyListenersException(String s) {
    super(s);
  }
}