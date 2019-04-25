package java.beans;

import java.io.Serializable;

public class VetoableChangeSupport implements Serializable {
  public VetoableChangeSupport(Object sourceBean) {
  }
  public void addVetoableChangeListener(VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeVetoableChangeListener(VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VetoableChangeListener [] getVetoableChangeListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addVetoableChangeListener(String propertyName, VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeVetoableChangeListener(String propertyName, VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VetoableChangeListener [] getVetoableChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireVetoableChange(String propertyName,Object oldValue, Object newValue) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireVetoableChange(String propertyName,int oldValue, int newValue) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireVetoableChange(String propertyName,boolean oldValue, boolean newValue) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireVetoableChange(PropertyChangeEvent event) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}