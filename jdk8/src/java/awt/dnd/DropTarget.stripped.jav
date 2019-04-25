package java.awt.dnd;

import java.util.TooManyListenersException;
import java.io.Serializable;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.datatransfer.FlavorMap;
import java.awt.peer.ComponentPeer;

public class DropTarget implements DropTargetListener, Serializable {
  public DropTarget(Component c,int ops,DropTargetListener dtl,boolean act, FlavorMap fm) throws HeadlessException{
  }
  public DropTarget(Component c,int ops,DropTargetListener dtl, boolean act) throws HeadlessException{
    this(c, ops, dtl, act, null);
  }
  public DropTarget( ) throws HeadlessException{
    this(null, DnDConstants.ACTION_COPY_OR_MOVE, null, true, null);
  }
  public DropTarget(Component c, DropTargetListener dtl) throws HeadlessException{
    this(c, DnDConstants.ACTION_COPY_OR_MOVE, dtl, true, null);
  }
  public DropTarget(Component c,int ops, DropTargetListener dtl) throws HeadlessException{
    this(c, ops, dtl, true);
  }
  public synchronized void setComponent(Component c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDefaultActions(int ops) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDefaultActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setActive(boolean isActive) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isActive( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addDropTargetListener(DropTargetListener dtl) throws TooManyListenersException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeDropTargetListener(DropTargetListener dtl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void dragEnter(DropTargetDragEvent dtde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void dragOver(DropTargetDragEvent dtde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void dropActionChanged(DropTargetDragEvent dtde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void dragExit(DropTargetEvent dte) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void drop(DropTargetDropEvent dtde) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FlavorMap getFlavorMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFlavorMap(FlavorMap fm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify(ComponentPeer peer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify(ComponentPeer peer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DropTargetContext getDropTargetContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}