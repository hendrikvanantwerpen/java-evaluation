package java.security;

import java.security.spec.AlgorithmParameterSpec;
import java.util.*;
import java.io.*;
import java.security.cert.Certificate;
import java.nio.ByteBuffer;
import sun.security.jca.*;

public abstract class Signature extends SignatureSpi {
  protected Signature(String algorithm) {
  }
  public static Signature getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Signature getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Signature getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void initVerify(PublicKey publicKey) throws InvalidKeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void initVerify(Certificate certificate) throws InvalidKeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void initSign(PrivateKey privateKey) throws InvalidKeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void initSign(PrivateKey privateKey, SecureRandom random) throws InvalidKeyException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final byte [] sign( ) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int sign(byte [] outbuf,int offset, int len) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean verify(byte [] signature) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean verify(byte [] signature,int offset, int length) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void update(byte b) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void update(byte [] data) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void update(byte [] data,int off, int len) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void update(ByteBuffer data) throws SignatureException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setParameter(String param, Object value) throws InvalidParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setParameter(AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final AlgorithmParameters getParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Object getParameter(String param) throws InvalidParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) throws CloneNotSupportedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}