package java.net;


public class URISyntaxException extends Exception {
  public URISyntaxException(String input,String reason, int index) {
    super(reason);
  }
  public URISyntaxException(String input, String reason) {
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