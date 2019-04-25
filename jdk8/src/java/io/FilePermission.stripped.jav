package java.io;

import java.security.*;

public final class FilePermission extends Permission implements Serializable {
  public FilePermission(String path, String actions) {
    super(path);
  }
  FilePermission(String path, int mask) {
    super(path);
  }
  public boolean implies(Permission p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PermissionCollection newPermissionCollection( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}