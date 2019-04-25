package java.security.cert;

import java.util.Collection;

public class CollectionCertStoreParameters implements CertStoreParameters {
  public CollectionCertStoreParameters(Collection<?> collection) {
  }
  public CollectionCertStoreParameters( ) {
  }
  public Collection<?> getCollection( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}