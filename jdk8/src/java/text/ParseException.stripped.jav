package java.text;


public class ParseException extends Exception {
  public ParseException(String s, int errorOffset) {
    super(s);
  }
  public int getErrorOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}