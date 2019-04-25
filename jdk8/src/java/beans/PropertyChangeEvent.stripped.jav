package java.beans;

import java.util.EventObject;

public class PropertyChangeEvent extends EventObject {
  public PropertyChangeEvent(Object source,String propertyName,Object oldValue, Object newValue) {
    super(source);
  }
  public String getPropertyName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getNewValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getOldValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPropagationId(Object propagationId) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getPropagationId( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}