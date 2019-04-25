package java.security.spec;


public class PSSParameterSpec implements AlgorithmParameterSpec {
  public static final PSSParameterSpec DEFAULT;
  private PSSParameterSpec( ) {
  }
  public PSSParameterSpec(String mdName,String mgfName,AlgorithmParameterSpec mgfSpec,int saltLen, int trailerField) {
  }
  public PSSParameterSpec(int saltLen) {
  }
  public String getDigestAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getMGFAlgorithm( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AlgorithmParameterSpec getMGFParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSaltLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTrailerField( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}