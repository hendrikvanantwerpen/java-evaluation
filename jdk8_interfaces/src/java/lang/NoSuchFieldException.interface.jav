package java.lang;


public class NoSuchFieldException extends ReflectiveOperationException {
  private static final long serialVersionUID;
  public NoSuchFieldException( ) {
    super( );
  }
  public NoSuchFieldException(String s) {
    super(s);
  }
}