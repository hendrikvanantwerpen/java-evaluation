package java.awt;

import java.awt.event.*;
import java.util.EventListener;
import javax.accessibility.*;

public class Scrollbar extends Component implements Adjustable, Accessible {
  public static final int HORIZONTAL;
  public static final int VERTICAL;
  public Scrollbar( ) throws HeadlessException{
    this(VERTICAL, 0, 10, 0, 100);
  }
  public Scrollbar(int orientation) throws HeadlessException{
    this(orientation, 0, 10, 0, 100);
  }
  public Scrollbar(int orientation,int value,int visible,int minimum, int maximum) throws HeadlessException{
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOrientation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOrientation(int orientation) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setValue(int newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMinimum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinimum(int newMinimum) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaximum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaximum(int newMaximum) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVisibleAmount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVisible( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setVisibleAmount(int newAmount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUnitIncrement(int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setLineIncrement(int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getUnitIncrement( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLineIncrement( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBlockIncrement(int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setPageIncrement(int v) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBlockIncrement( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPageIncrement( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setValues(int value,int visible,int minimum, int maximum) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getValueIsAdjusting( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setValueIsAdjusting(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addAdjustmentListener(AdjustmentListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeAdjustmentListener(AdjustmentListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized AdjustmentListener [] getAdjustmentListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}