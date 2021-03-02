package java.io;


public class InvalidClassException extends ObjectStreamException {
  private static final long serialVersionUID;
  public String classname;
  public InvalidClassException(String reason) {
    super(reason);
  }
  public InvalidClassException(String cname, String reason) {
    super(reason);
  }
  public String getMessage( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
}