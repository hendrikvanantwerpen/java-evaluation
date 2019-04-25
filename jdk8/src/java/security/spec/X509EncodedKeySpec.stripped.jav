package java.security.spec;


public class X509EncodedKeySpec extends EncodedKeySpec {
  public X509EncodedKeySpec(byte [] encodedKey) {
    super(encodedKey);
  }
  public byte [] getEncoded( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getFormat( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}