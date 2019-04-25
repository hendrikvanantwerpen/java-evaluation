package java.security.spec;


public class PKCS8EncodedKeySpec extends EncodedKeySpec {
  public PKCS8EncodedKeySpec(byte [] encodedKey) {
    super(encodedKey);
  }
  public byte [] getEncoded( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getFormat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}