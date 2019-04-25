package java.io;

import java.util.stream.Stream;

public class BufferedReader extends Reader {
  public BufferedReader(Reader in, int sz) {
    super(in);
  }
  public BufferedReader(Reader in) {
    this(in, defaultCharBufferSize);
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(char cbuf[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String readLine( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
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
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Stream<String> lines( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}