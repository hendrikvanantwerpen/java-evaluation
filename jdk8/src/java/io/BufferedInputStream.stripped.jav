package java.io;


public class BufferedInputStream extends FilterInputStream {
  public BufferedInputStream(InputStream in) {
    this(in, DEFAULT_BUFFER_SIZE);
  }
  public BufferedInputStream(InputStream in, int size) {
    super(in);
  }
  public synchronized int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int read(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void mark(int readlimit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean markSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}