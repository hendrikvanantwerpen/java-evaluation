package java.io;


public class UncheckedIOException extends RuntimeException {
  public UncheckedIOException(String message, IOException cause) {
    super(message, Objects. requireNonNull(cause));
  }
  public UncheckedIOException(IOException cause) {
    super(Objects. requireNonNull(cause));
  }
  public IOException getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}