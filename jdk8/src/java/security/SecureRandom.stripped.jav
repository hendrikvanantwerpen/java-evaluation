package java.security;

import java.util.*;
import java.util.regex.*;
import sun.security.jca.*;

public class SecureRandom extends java. util. Random {
  public SecureRandom( ) {
    super(0);
  }
  public SecureRandom(byte seed[]) {
    super(0);
  }
  protected SecureRandom(SecureRandomSpi secureRandomSpi, Provider provider) {
    this(secureRandomSpi, provider, null);
  }
  private SecureRandom(SecureRandomSpi secureRandomSpi,Provider provider, String algorithm) {
    super(0);
  }
  public static SecureRandom getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static SecureRandom getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static SecureRandom getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  synchronized public void setSeed(byte [] seed) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSeed(long seed) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  synchronized public void nextBytes(byte [] bytes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static byte [] getSeed(int numBytes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] generateSeed(int numBytes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static SecureRandom getInstanceStrong( ) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}