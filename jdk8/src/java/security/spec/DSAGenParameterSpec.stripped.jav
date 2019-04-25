package java.security.spec;


public final class DSAGenParameterSpec implements AlgorithmParameterSpec {
  public DSAGenParameterSpec(int primePLen, int subprimeQLen) {
    this(primePLen, subprimeQLen, subprimeQLen);
  }
  public DSAGenParameterSpec(int primePLen,int subprimeQLen, int seedLen) {
  }
  public int getPrimePLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSubprimeQLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSeedLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}