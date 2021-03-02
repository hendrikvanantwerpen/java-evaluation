package java.lang;


public class ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException {
  private static final long serialVersionUID;
  public ArrayIndexOutOfBoundsException( ) {
    super( );
  }
  public ArrayIndexOutOfBoundsException(int index) {
    super("Array index out of range: " + index);
  }
  public ArrayIndexOutOfBoundsException(String s) {
    super(s);
  }
}