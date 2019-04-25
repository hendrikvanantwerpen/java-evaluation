package java.security;

import java.util.*;
import java.lang.*;
import java.nio.ByteBuffer;

public abstract class MessageDigest extends MessageDigestSpi {
  protected MessageDigest(String algorithm) {
  }
  public static MessageDigest getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MessageDigest getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MessageDigest getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(byte input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(byte [] input,int offset, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(byte [] input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void update(ByteBuffer input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] digest( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int digest(byte [] buf,int offset, int len) throws DigestException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] digest(byte [] input) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isEqual(byte [] digesta, byte [] digestb) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int getDigestLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) throws CloneNotSupportedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}