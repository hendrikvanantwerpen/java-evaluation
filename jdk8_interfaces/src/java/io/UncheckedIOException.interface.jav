package java.io;


public class UncheckedIOException extends RuntimeException {
  public UncheckedIOException(String message, IOException cause) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public UncheckedIOException(IOException cause) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IOException getCause( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
}