package java.security;

import java.util.*;
import java.security.spec.AlgorithmParameterSpec;
import sun.security.jca.*;

public abstract class KeyPairGenerator extends KeyPairGeneratorSpi {
  protected KeyPairGenerator(String algorithm) {
  }
  public String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyPairGenerator getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyPairGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static KeyPairGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void initialize(int keysize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void initialize(int keysize, SecureRandom random) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void initialize(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void initialize(AlgorithmParameterSpec params, SecureRandom random) throws InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final KeyPair genKeyPair( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public KeyPair generateKeyPair( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}