package java.io;


public class StringBufferInputStream extends InputStream {
  public StringBufferInputStream(String s) {
  }
  public synchronized int read( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int read(byte b[],int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized long skip(long n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int available( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}