package java.text;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public interface AttributedCharacterIterator extends CharacterIterator {
  public static class Attribute implements Serializable {
    public final boolean equals(Object obj) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public final int hashCode( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    public static final Attribute LANGUAGE;
    public static final Attribute READING;
    public static final Attribute INPUT_METHOD_SEGMENT;
  }
  public int getRunStart( ) ;
  public int getRunStart(Attribute attribute) ;
  public int getRunStart(Set<? extends Attribute> attributes) ;
  public int getRunLimit( ) ;
  public int getRunLimit(Attribute attribute) ;
  public int getRunLimit(Set<? extends Attribute> attributes) ;
  public Map<Attribute, Object> getAttributes( ) ;
  public Object getAttribute(Attribute attribute) ;
  public Set<Attribute> getAllAttributeKeys( ) ;
}