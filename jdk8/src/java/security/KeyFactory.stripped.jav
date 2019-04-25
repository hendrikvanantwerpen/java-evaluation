package java.security;

import java.util.*;
import java.security.spec.KeySpec;
import java.security.spec.InvalidKeySpecException;
import sun.security.jca.*;

public class KeyFactory {
  protected KeyFactory(KeyFactorySpi keyFacSpi,Provider provider, String algorithm) {
  }
  private KeyFactory(String algorithm) throws NoSuchAlgorithmException{
  }
  public static KeyFactory getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyFactory getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyFactory getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final PublicKey generatePublic(KeySpec keySpec) throws InvalidKeySpecException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final PrivateKey generatePrivate(KeySpec keySpec) throws InvalidKeySpecException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final <T extends KeySpec> T getKeySpec(Key key, Class<T> keySpec) throws InvalidKeySpecException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Key translateKey(Key key) throws InvalidKeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}