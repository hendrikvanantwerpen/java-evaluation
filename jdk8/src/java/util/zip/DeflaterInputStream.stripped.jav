package java.util.zip;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class DeflaterInputStream extends FilterInputStream {
  public DeflaterInputStream(InputStream in) {
    this(in, new Deflater ( ));
  }
  public DeflaterInputStream(InputStream in, Deflater defl) {
    this(in, defl, 512);
  }
  public DeflaterInputStream(InputStream in,Deflater defl, int bufLen) {
    super(in);
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean markSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mark(int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}