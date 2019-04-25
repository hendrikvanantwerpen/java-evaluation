package java.awt.dnd;

import java.awt.Component;
import java.awt.dnd.peer.DropTargetContextPeer;
import java.io.Serializable;

public class DropTargetContext implements Serializable {
  DropTargetContext(DropTarget dt) {
    super( );
  }
  public DropTarget getDropTarget( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify(DropTargetContextPeer dtcp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dropComplete(boolean success) throws InvalidDnDOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}