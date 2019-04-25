package java.lang;


public class TypeNotPresentException extends RuntimeException {
  public TypeNotPresentException(String typeName, Throwable cause) {
    super("Type " + typeName + " not present", cause);
  }
  public String typeName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}