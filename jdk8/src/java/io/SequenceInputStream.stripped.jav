package java.io;

import java.io.InputStream;
import java.util.Enumeration;

public class SequenceInputStream extends InputStream {
  public SequenceInputStream(Enumeration<? extends InputStream> e) {
  }
  public SequenceInputStream(InputStream s1, InputStream s2) {
  }
  public int available( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte b[],int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void close( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}