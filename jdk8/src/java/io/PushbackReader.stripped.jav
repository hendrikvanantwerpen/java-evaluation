package java.io;


public class PushbackReader extends FilterReader {
  public PushbackReader(Reader in, int size) {
    super(in);
  }
  public PushbackReader(Reader in) {
    this(in, 1);
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void unread(int c) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void unread(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void unread(char cbuf[]) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean ready( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mark(int readAheadLimit) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean markSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}