package java.util.zip;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class InflaterInputStream extends FilterInputStream {
  public InflaterInputStream(InputStream in,Inflater inf, int size) {
    super(in);
  }
  public InflaterInputStream(InputStream in, Inflater inf) {
    this(in, inf, 512);
  }
  public InflaterInputStream(InputStream in) {
    this(in, new Inflater ( ));
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
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
}