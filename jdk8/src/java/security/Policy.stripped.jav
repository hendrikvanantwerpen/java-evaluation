package java.security;


public abstract class Policy {
  public static final PermissionCollection UNSUPPORTED_EMPTY_COLLECTION;
  public static Policy getPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setPolicy(Policy p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Policy getInstance(String type, Policy. Parameters params) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Policy getInstance(String type,Policy. Parameters params, String provider) throws NoSuchProviderException, NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Policy getInstance(String type,Policy. Parameters params, Provider provider) throws NoSuchAlgorithmException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Provider getProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Policy. Parameters getParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PermissionCollection getPermissions(CodeSource codesource) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PermissionCollection getPermissions(ProtectionDomain domain) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean implies(ProtectionDomain domain, Permission permission) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void refresh( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static interface Parameters {
  }
}