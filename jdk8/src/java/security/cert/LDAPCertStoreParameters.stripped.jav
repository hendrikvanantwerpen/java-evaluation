package java.security.cert;


public class LDAPCertStoreParameters implements CertStoreParameters {
  public LDAPCertStoreParameters(String serverName, int port) {
  }
  public LDAPCertStoreParameters(String serverName) {
    this(serverName, LDAP_DEFAULT_PORT);
  }
  public LDAPCertStoreParameters( ) {
    this("localhost", LDAP_DEFAULT_PORT);
  }
  public String getServerName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPort( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}