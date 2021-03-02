package java.beans;

import java.io.Serializable;
import java.io.ObjectStreamField;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class PropertyChangeSupport implements Serializable {
  private PropertyChangeListenerMap map;
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
  private static void fire(PropertyChangeListener [] listeners, PropertyChangeEvent event) {
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
  private void writeObject(ObjectOutputStream s) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  private Object source;
  private static final ObjectStreamField [] serialPersistentFields;
  static final long serialVersionUID;
  private static final class PropertyChangeListenerMap extends ChangeListenerMap<PropertyChangeListener> {
    private static final PropertyChangeListener [] EMPTY;
    protected PropertyChangeListener [] newArray(int length) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    protected PropertyChangeListener newProxy(String name, PropertyChangeListener listener) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
    public final PropertyChangeListener extract(PropertyChangeListener listener) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  }
}