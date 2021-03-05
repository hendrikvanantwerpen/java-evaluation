package java.security;


public abstract class Permission implements Guard, java. io. Serializable {
  public Permission(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void checkGuard(Object object) throws SecurityException {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public abstract boolean implies(Permission permission) ;
  public abstract boolean equals(Object obj) ;
  public abstract int hashCode( ) ;
  public final String getName( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public abstract String getActions( ) ;
  public PermissionCollection newPermissionCollection( ) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}