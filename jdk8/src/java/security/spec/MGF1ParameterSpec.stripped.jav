package java.security.spec;

import java.security.spec.AlgorithmParameterSpec;

public class MGF1ParameterSpec implements AlgorithmParameterSpec {
  public static final MGF1ParameterSpec SHA1;
  public static final MGF1ParameterSpec SHA224;
  public static final MGF1ParameterSpec SHA256;
  public static final MGF1ParameterSpec SHA384;
  public static final MGF1ParameterSpec SHA512;
  public MGF1ParameterSpec(String mdName) {
  }
  public String getDigestAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}