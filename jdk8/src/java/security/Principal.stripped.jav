package java.security;

import javax.security.auth.Subject;

public interface Principal {
  public boolean equals(Object another) ;
  public String toString( ) ;
  public int hashCode( ) ;
  public String getName( ) ;
  public default boolean implies(Subject subject) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}