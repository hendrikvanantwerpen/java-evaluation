package java.awt;

import java.util.*;
import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;

public class Choice extends Component implements ItemSelectable, Accessible {
  public Choice( ) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getItemCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int countItems( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getItem(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(String item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addItem(String item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void insert(String item, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(String item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(int position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeAll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String getSelectedItem( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Object [] getSelectedObjects( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSelectedIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void select(int pos) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void select(String str) {
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