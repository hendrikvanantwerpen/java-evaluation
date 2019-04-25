package java.awt;

import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;

public class MenuItem extends MenuComponent implements Accessible {
  public MenuItem( ) throws HeadlessException{
    this("", null);
  }
  public MenuItem(String label) throws HeadlessException{
    this(label, null);
  }
  public MenuItem(String label, MenuShortcut s) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLabel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setLabel(String label) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEnabled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setEnabled(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void enable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void enable(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void disable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuShortcut getShortcut( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setShortcut(MenuShortcut s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void deleteShortcut( ) {
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
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}