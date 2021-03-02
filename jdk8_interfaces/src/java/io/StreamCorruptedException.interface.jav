package java.io;


public class StreamCorruptedException extends ObjectStreamException {
  private static final long serialVersionUID;
  public StreamCorruptedException(String reason) {
    super(reason);
  }
  public StreamCorruptedException( ) {
    super( );
  }
}