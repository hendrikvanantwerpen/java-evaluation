package java.util.logging;

import java.io.*;

public class StreamHandler extends Handler {
  public StreamHandler( ) {
  }
  public StreamHandler(OutputStream out, Formatter formatter) {
  }
  public synchronized void setEncoding(String encoding) throws SecurityException, java. io. UnsupportedEncodingException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void publish(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLoggable(LogRecord record) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void flush( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void close( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}