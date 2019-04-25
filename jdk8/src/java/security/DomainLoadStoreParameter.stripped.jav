package java.security;

import java.net.URI;
import java.util.*;

public final class DomainLoadStoreParameter implements LoadStoreParameter {
  public DomainLoadStoreParameter(URI configuration, Map<String, ProtectionParameter> protectionParams) {
  }
  public URI getConfiguration( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Map<String, ProtectionParameter> getProtectionParams( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public KeyStore. ProtectionParameter getProtectionParameter( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}