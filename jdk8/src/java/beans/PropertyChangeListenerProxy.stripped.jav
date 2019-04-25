package java.beans;

import java.util.EventListenerProxy;

public class PropertyChangeListenerProxy extends EventListenerProxy<PropertyChangeListener> implements PropertyChangeListener {
  public PropertyChangeListenerProxy(String propertyName, PropertyChangeListener listener) {
    super(listener);
  }
  public void propertyChange(PropertyChangeEvent event) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPropertyName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}