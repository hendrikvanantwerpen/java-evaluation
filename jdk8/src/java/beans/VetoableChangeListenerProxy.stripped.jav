package java.beans;

import java.util.EventListenerProxy;

public class VetoableChangeListenerProxy extends EventListenerProxy<VetoableChangeListener> implements VetoableChangeListener {
  public VetoableChangeListenerProxy(String propertyName, VetoableChangeListener listener) {
    super(listener);
  }
  public void vetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getPropertyName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}