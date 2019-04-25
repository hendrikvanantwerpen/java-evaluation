package java.awt.dnd;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.io.Serializable;
import java.util.TooManyListenersException;

public class DragSourceContext implements DragSourceListener, DragSourceMotionListener, Serializable {
  public DragSourceContext(DragSourceContextPeer dscp,DragGestureEvent trigger,Cursor dragCursor,Image dragImage,Point offset,Transferable t, DragSourceListener dsl) {
  }
  public DragSource getDragSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DragGestureEvent getTrigger( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSourceActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setCursor(Cursor c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Cursor getCursor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addDragSourceListener(DragSourceListener dsl) throws TooManyListenersException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeDragSourceListener(DragSourceListener dsl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transferablesFlavorsChanged( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dragEnter(DragSourceDragEvent dsde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dragOver(DragSourceDragEvent dsde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dragExit(DragSourceEvent dse) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dropActionChanged(DragSourceDragEvent dsde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dragDropEnd(DragSourceDropEvent dsde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dragMouseMoved(DragSourceDragEvent dsde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Transferable getTransferable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}