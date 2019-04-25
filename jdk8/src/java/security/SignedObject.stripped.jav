package java.security;

import java.io.*;

public final class SignedObject implements Serializable {
  public SignedObject(Serializable object,PrivateKey signingKey, Signature signingEngine) throws IOException, InvalidKeyException, SignatureException{
  }
  public Object getObject( ) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getSignature( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean verify(PublicKey verificationKey, Signature verificationEngine) throws InvalidKeyException, SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}