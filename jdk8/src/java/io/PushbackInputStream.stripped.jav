package java.io;


public class PushbackInputStream extends FilterInputStream {
  public PushbackInputStream(InputStream in, int size) {
    super(in);
  }
  public PushbackInputStream(InputStream in) {
    this(in, 1);
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void unread(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void unread(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void unread(byte [] b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean markSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void mark(int readlimit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}