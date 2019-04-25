package java.awt;

import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;

public class Checkbox extends Component implements ItemSelectable, Accessible {
  public Checkbox( ) throws HeadlessException{
    this("", false, null);
  }
  public Checkbox(String label) throws HeadlessException{
    this(label, false, null);
  }
  public Checkbox(String label, boolean state) throws HeadlessException{
    this(label, state, null);
  }
  public Checkbox(String label,boolean state, CheckboxGroup group) throws HeadlessException{
  }
  public Checkbox(String label,CheckboxGroup group, boolean state) throws HeadlessException{
    this(label, state, group);
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
  public boolean getState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setState(boolean state) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] getSelectedObjects( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CheckboxGroup getCheckboxGroup( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCheckboxGroup(CheckboxGroup g) {
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
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}