package java.beans.beancontext;

import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.PropertyVetoException;
import java.io.Serializable;

public class BeanContextChildSupport implements BeanContextChild, BeanContextServicesListener, Serializable {
  public BeanContextChildSupport( ) {
    super( );
  }
  public BeanContextChildSupport(BeanContextChild bcc) {
    super( );
  }
  public synchronized void setBeanContext(BeanContext bc) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized BeanContext getBeanContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String name, PropertyChangeListener pcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(String name, PropertyChangeListener pcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addVetoableChangeListener(String name, VetoableChangeListener vcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeVetoableChangeListener(String name, VetoableChangeListener vcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void serviceRevoked(BeanContextServiceRevokedEvent bcsre) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void serviceAvailable(BeanContextServiceAvailableEvent bcsae) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BeanContextChild getBeanContextChildPeer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDelegated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String name,Object oldValue, Object newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireVetoableChange(String name,Object oldValue, Object newValue) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean validatePendingSetBeanContext(BeanContext newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BeanContextChild beanContextChildPeer;
}