package java.util.zip;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.IOException;

public class CheckedOutputStream extends FilterOutputStream {
  public CheckedOutputStream(OutputStream out, Checksum cksum) {
    super(out);
  }
  public void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Checksum getChecksum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}