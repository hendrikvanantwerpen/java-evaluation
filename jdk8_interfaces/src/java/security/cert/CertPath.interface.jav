package java.security.cert;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public abstract class CertPath implements Serializable {
  public String getType( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public abstract Iterator<String> getEncodings( ) ;
  public boolean equals(Object other) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public abstract byte [] getEncoded( ) throws CertificateEncodingException ;
  public abstract byte [] getEncoded(String encoding) throws CertificateEncodingException ;
  public abstract List<? extends Certificate> getCertificates( ) ;
  protected static class CertPathRep implements Serializable {
  }
}