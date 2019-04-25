package java.util.zip;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.IOException;

public class CheckedInputStream extends FilterInputStream {
  public CheckedInputStream(InputStream in, Checksum cksum) {
    super(in);
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] buf,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long skip(long n) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Checksum getChecksum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}