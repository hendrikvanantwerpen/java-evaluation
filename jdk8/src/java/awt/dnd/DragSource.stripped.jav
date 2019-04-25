package java.awt.dnd;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Point;
import java.awt.datatransfer.FlavorMap;
import java.awt.datatransfer.Transferable;
import java.io.Serializable;
import java.util.EventListener;

public class DragSource implements Serializable {
  public static final Cursor DefaultCopyDrop;
  public static final Cursor DefaultMoveDrop;
  public static final Cursor DefaultLinkDrop;
  public static final Cursor DefaultCopyNoDrop;
  public static final Cursor DefaultMoveNoDrop;
  public static final Cursor DefaultLinkNoDrop;
  public static DragSource getDefaultDragSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isDragImageSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DragSource( ) throws HeadlessException{
  }
  public void startDrag(DragGestureEvent trigger,Cursor dragCursor,Image dragImage,Point imageOffset,Transferable transferable,DragSourceListener dsl, FlavorMap flavorMap) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startDrag(DragGestureEvent trigger,Cursor dragCursor,Transferable transferable,DragSourceListener dsl, FlavorMap flavorMap) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startDrag(DragGestureEvent trigger,Cursor dragCursor,Image dragImage,Point dragOffset,Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startDrag(DragGestureEvent trigger,Cursor dragCursor,Transferable transferable, DragSourceListener dsl) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FlavorMap getFlavorMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends DragGestureRecognizer> T createDragGestureRecognizer(Class<T> recognizerAbstractClass,Component c,int actions, DragGestureListener dgl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DragGestureRecognizer createDefaultDragGestureRecognizer(Component c,int actions, DragGestureListener dgl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addDragSourceListener(DragSourceListener dsl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeDragSourceListener(DragSourceListener dsl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DragSourceListener [] getDragSourceListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addDragSourceMotionListener(DragSourceMotionListener dsml) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeDragSourceMotionListener(DragSourceMotionListener dsml) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DragSourceMotionListener [] getDragSourceMotionListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int getDragThreshold( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}