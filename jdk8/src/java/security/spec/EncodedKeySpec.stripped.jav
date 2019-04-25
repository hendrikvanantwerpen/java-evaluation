package java.security.spec;


public abstract class EncodedKeySpec implements KeySpec {
  public EncodedKeySpec(byte [] encodedKey) {
  }
  public byte [] getEncoded( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract String getFormat( ) ;
}