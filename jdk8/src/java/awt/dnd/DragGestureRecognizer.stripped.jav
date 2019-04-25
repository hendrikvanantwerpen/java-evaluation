package java.awt.dnd;

import java.awt.event.InputEvent;
import java.awt.Component;
import java.util.TooManyListenersException;
import java.io.Serializable;

public abstract class DragGestureRecognizer implements Serializable {
  protected DragGestureRecognizer(DragSource ds,Component c,int sa, DragGestureListener dgl) {
    super( );
  }
  protected DragGestureRecognizer(DragSource ds,Component c, int sa) {
    this(ds, c, sa, null);
  }
  protected DragGestureRecognizer(DragSource ds, Component c) {
    this(ds, c, DnDConstants.ACTION_NONE);
  }
  protected DragGestureRecognizer(DragSource ds) {
    this(ds, null);
  }
  public DragSource getDragSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setComponent(Component c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getSourceActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setSourceActions(int actions) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputEvent getTriggerEvent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void resetRecognizer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addDragGestureListener(DragGestureListener dgl) throws TooManyListenersException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeDragGestureListener(DragGestureListener dgl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}