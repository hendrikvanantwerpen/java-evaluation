package java.security;

import java.security.spec.AlgorithmParameterSpec;

public class AlgorithmParameterGenerator {
  protected AlgorithmParameterGenerator(AlgorithmParameterGeneratorSpi paramGenSpi,Provider provider, String algorithm) {
  }
  public final String getAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlgorithmParameterGenerator getInstance(String algorithm) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlgorithmParameterGenerator getInstance(String algorithm, String provider) throws NoSuchAlgorithmException, NoSuchProviderException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static AlgorithmParameterGenerator getInstance(String algorithm, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(int size) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(int size, SecureRandom random) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(AlgorithmParameterSpec genParamSpec) throws InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void init(AlgorithmParameterSpec genParamSpec, SecureRandom random) throws InvalidAlgorithmParameterException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final AlgorithmParameters generateParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}