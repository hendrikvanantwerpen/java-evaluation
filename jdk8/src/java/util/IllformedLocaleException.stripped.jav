package java.util;


public class IllformedLocaleException extends RuntimeException {
  public IllformedLocaleException( ) {
    super( );
  }
  public IllformedLocaleException(String message) {
    super(message);
  }
  public IllformedLocaleException(String message, int errorIndex) {
    super(message + (errorIndex < 0 ? "" : " [at index " + errorIndex + "]"));
  }
  public int getErrorIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}