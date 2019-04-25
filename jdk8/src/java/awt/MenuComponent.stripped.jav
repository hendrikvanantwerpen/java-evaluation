package java.awt;

import java.awt.peer.MenuComponentPeer;
import javax.accessibility.*;

public abstract class MenuComponent implements java. io. Serializable {
  public MenuComponent( ) throws HeadlessException{
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setName(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuContainer getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuComponentPeer getPeer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font getFont( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFont(Font f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean postEvent(Event evt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void dispatchEvent(AWTEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}