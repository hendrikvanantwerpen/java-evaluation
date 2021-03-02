package java.security;

import java.nio.ByteBuffer;

public abstract class MessageDigestSpi {
  private byte [] tempArray;
  protected int engineGetDigestLength( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  protected abstract void engineUpdate(byte input) ;
  protected abstract void engineUpdate(byte [] input,int offset, int len) ;
  protected void engineUpdate(ByteBuffer input) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  protected abstract byte [] engineDigest( ) ;
  protected int engineDigest(byte [] buf,int offset, int len) throws DigestException {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  protected abstract void engineReset( ) ;
  public Object clone( ) throws CloneNotSupportedException {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
}