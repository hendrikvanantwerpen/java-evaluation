package java.awt;

import java.beans.PropertyChangeListener;

public class SystemTray {
  private SystemTray( ) {
  }
  public static SystemTray getSystemTray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(TrayIcon trayIcon) throws AWTException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(TrayIcon trayIcon) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TrayIcon [] getTrayIcons( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getTrayIconSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized PropertyChangeListener [] getPropertyChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}