package java.util;


public class MissingResourceException extends RuntimeException {
  public MissingResourceException(String s,String className, String key) {
    super(s);
  }
  MissingResourceException(String message,String className,String key, Throwable cause) {
    super(message, cause);
  }
  public String getClassName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}