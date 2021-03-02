package java.util;


public class NoSuchElementException extends RuntimeException {
  private static final long serialVersionUID;
  public NoSuchElementException( ) {
    super( );
  }
  public NoSuchElementException(String s) {
    super(s);
  }
}