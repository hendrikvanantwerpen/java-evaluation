package java.awt.print;

import java.io.IOException;

public class PrinterIOException extends PrinterException {
  public PrinterIOException(IOException exception) {
  }
  public IOException getIOException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getCause( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}