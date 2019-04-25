package java.awt;

import java.util.EventListener;
import java.awt.event.*;
import javax.accessibility.*;

public class Button extends Component implements Accessible {
  public Button( ) throws HeadlessException{
    this("");
  }
  public Button(String label) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLabel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLabel(String label) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setActionCommand(String command) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getActionCommand( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addActionListener(ActionListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeActionListener(ActionListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ActionListener [] getActionListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}