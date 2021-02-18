package java.beans;

import java.io.Serializable;

public class PropertyChangeSupport implements Serializable {
  private static final class PropertyChangeListenerMap extends ChangeListenerMap<PropertyChangeListener> {
  }
}