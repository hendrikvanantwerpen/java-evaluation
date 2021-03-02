package java.io;


public class UncheckedIOException extends RuntimeException {
  private static final long serialVersionUID;
  public UncheckedIOException(String message, IOException cause) {
    super(message, Objects. requireNonNull(cause));
  }
  public UncheckedIOException(IOException cause) {
    super(Objects. requireNonNull(cause));
  }
  public IOException getCause( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
}