package java.awt;

import java.util.EventListener;
import java.awt.event.*;
import javax.accessibility.*;

public class List extends Component implements ItemSelectable, Accessible {
  public List( ) throws HeadlessException{
    this(0, false);
  }
  public List(int rows) throws HeadlessException{
    this(rows, false);
  }
  public List(int rows, boolean multipleMode) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
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
  public synchronized String [] getItems( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(String item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addItem(String item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(String item, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addItem(String item, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void replaceItem(String newValue, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeAll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void remove(String item) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(int position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void delItem(int position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getSelectedIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int [] getSelectedIndexes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String getSelectedItem( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized String [] getSelectedItems( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] getSelectedObjects( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void select(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void deselect(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isIndexSelected(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSelected(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRows( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMultipleMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean allowsMultipleSelections( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMultipleMode(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setMultipleSelections(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVisibleIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void makeVisible(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize(int rows) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize(int rows) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize(int rows) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize(int rows) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize( ) {
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
  public synchronized void delItems(int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}