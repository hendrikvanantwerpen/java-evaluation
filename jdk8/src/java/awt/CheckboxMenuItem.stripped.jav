package java.awt;

import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;

public class CheckboxMenuItem extends MenuItem implements ItemSelectable, Accessible {
  public CheckboxMenuItem( ) throws HeadlessException{
    this("", false);
  }
  public CheckboxMenuItem(String label) throws HeadlessException{
    this(label, false);
  }
  public CheckboxMenuItem(String label, boolean state) throws HeadlessException{
    super(label);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setState(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Object [] getSelectedObjects( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addItemListener(ItemListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeItemListener(ItemListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ItemListener [] getItemListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}