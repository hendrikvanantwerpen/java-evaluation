package java.security;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

public class DigestOutputStream extends FilterOutputStream {
  public DigestOutputStream(OutputStream stream, MessageDigest digest) {
    super(stream);
  }
  public MessageDigest getMessageDigest( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMessageDigest(MessageDigest digest) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(int b) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void write(byte [] b,int off, int len) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void on(boolean on) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}