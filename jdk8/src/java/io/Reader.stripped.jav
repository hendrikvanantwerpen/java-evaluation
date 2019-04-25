package java.io;


public abstract class Reader implements Readable, Closeable {
  protected Reader( ) {
  }
  protected Reader(Object lock) {
  }
  public int read(java. nio. CharBuffer target) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(char cbuf[]) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public int read(char cbuf[],int off, int len) throws IOException ;
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean ready( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean markSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mark(int readAheadLimit) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public void close( ) throws IOException ;
}