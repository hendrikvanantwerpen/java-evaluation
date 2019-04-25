package java.security;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public class DigestInputStream extends FilterInputStream {
  public DigestInputStream(InputStream stream, MessageDigest digest) {
    super(stream);
  }
  public MessageDigest getMessageDigest( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMessageDigest(MessageDigest digest) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int read(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void on(boolean on) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}