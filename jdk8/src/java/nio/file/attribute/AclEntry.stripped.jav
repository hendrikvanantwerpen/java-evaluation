package java.nio.file.attribute;

import java.util.*;

public final class AclEntry {
  private AclEntry(AclEntryType type,UserPrincipal who,Set<AclEntryPermission> perms, Set<AclEntryFlag> flags) {
  }
  public static final class Builder {
    private Builder(AclEntryType type,UserPrincipal who,Set<AclEntryPermission> perms, Set<AclEntryFlag> flags) {
    }
    public AclEntry build( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setType(AclEntryType type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setPrincipal(UserPrincipal who) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setPermissions(Set<AclEntryPermission> perms) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setPermissions(AclEntryPermission ... perms) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setFlags(Set<AclEntryFlag> flags) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Builder setFlags(AclEntryFlag ... flags) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static Builder newBuilder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Builder newBuilder(AclEntry entry) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AclEntryType type( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public UserPrincipal principal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<AclEntryPermission> permissions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<AclEntryFlag> flags( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object ob) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}