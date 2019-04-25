package java.nio.file;

import java.util.ConcurrentModificationException;
import java.io.IOException;

public final class DirectoryIteratorException extends ConcurrentModificationException {
  public DirectoryIteratorException(IOException cause) {
    super(Objects. requireNonNull(cause));
  }
  public IOException getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}