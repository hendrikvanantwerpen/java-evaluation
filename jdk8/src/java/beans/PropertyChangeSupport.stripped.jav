package java.beans;

import java.io.Serializable;

public class PropertyChangeSupport implements Serializable {
  public PropertyChangeSupport(Object sourceBean) {
  }
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyChangeListener [] getPropertyChangeListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyChangeListener [] getPropertyChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,Object oldValue, Object newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,int oldValue, int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,boolean oldValue, boolean newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(PropertyChangeEvent event) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireIndexedPropertyChange(String propertyName,int index,Object oldValue, Object newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireIndexedPropertyChange(String propertyName,int index,int oldValue, int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void fireIndexedPropertyChange(String propertyName,int index,boolean oldValue, boolean newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}