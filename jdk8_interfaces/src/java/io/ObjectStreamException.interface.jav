package java.io;


public abstract class ObjectStreamException extends IOException {
  private static final long serialVersionUID;
  protected ObjectStreamException(String classname) {
    super(classname);
  }
  protected ObjectStreamException( ) {
    super( );
  }
}