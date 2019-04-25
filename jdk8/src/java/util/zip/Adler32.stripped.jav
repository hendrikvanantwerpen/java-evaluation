package java.util.zip;

import java.nio.ByteBuffer;

public class Adler32 implements Checksum {
  public Adler32( ) {
  }
  public void update(int b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(byte [] b,int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(byte [] b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(ByteBuffer buffer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}