package java.awt.dnd;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.InputEvent;
import java.awt.datatransfer.Transferable;
import java.util.EventObject;
import java.util.List;
import java.util.Iterator;

public class DragGestureEvent extends EventObject {
  public DragGestureEvent(DragGestureRecognizer dgr,int act,Point ori, List<? extends InputEvent> evs) {
    super(dgr);
  }
  public DragGestureRecognizer getSourceAsDragGestureRecognizer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DragSource getDragSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getDragOrigin( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator<InputEvent> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray(Object [] array) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDragAction( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputEvent getTriggerEvent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startDrag(Cursor dragCursor, Transferable transferable) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startDrag(Cursor dragCursor,Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startDrag(Cursor dragCursor,Image dragImage,Point imageOffset,Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}