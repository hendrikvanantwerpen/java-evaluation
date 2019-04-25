package java.awt.dnd;

import java.awt.dnd.DropTargetContext;

public class DropTargetEvent extends java. util. EventObject {
  public DropTargetEvent(DropTargetContext dtc) {
    super(dtc. getDropTarget( ));
  }
  public DropTargetContext getDropTargetContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}