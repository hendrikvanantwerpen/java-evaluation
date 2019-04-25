package java.security;

import java.io.*;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

public class AlgorithmParameters {
  protected AlgorithmParameters(AlgorithmParametersSpi paramSpi,Provider provider, String algorithm) {
  }
  public final String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlgorithmParameters getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlgorithmParameters getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlgorithmParameters getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(AlgorithmParameterSpec paramSpec) throws InvalidParameterSpecException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(byte [] params) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(byte [] params, String format) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final <T extends AlgorithmParameterSpec> T getParameterSpec(Class<T> paramSpec) throws InvalidParameterSpecException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final byte [] getEncoded( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final byte [] getEncoded(String format) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}