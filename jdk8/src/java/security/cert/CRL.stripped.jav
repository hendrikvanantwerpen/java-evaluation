package java.security.cert;


public abstract class CRL {
  protected CRL(String type) {
  }
  public final String getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract String toString( ) ;
  public abstract boolean isRevoked(Certificate cert) ;
}