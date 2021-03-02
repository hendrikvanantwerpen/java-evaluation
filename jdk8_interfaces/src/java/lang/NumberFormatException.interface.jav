package java.lang;


public class NumberFormatException extends IllegalArgumentException {
  static final long serialVersionUID;
  public NumberFormatException( ) {
    super( );
  }
  public NumberFormatException(String s) {
    super(s);
  }
  static NumberFormatException forInputString(String s) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
}