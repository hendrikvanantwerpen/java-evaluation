package java.nio.file;


public class InvalidPathException extends IllegalArgumentException {
  public InvalidPathException(String input,String reason, int index) {
    super(reason);
  }
  public InvalidPathException(String input, String reason) {
    this(input, reason, -1);
  }
  public String getInput( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getReason( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMessage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}