package java.awt.dnd;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.List;

public class DropTargetDropEvent extends DropTargetEvent {
  public DropTargetDropEvent(DropTargetContext dtc,Point cursorLocn,int dropAction, int srcActions) {
    super(dtc);
  }
  public DropTargetDropEvent(DropTargetContext dtc,Point cursorLocn,int dropAction,int srcActions, boolean isLocal) {
    this(dtc, cursorLocn, dropAction, srcActions);
  }
  public Point getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DataFlavor [] getCurrentDataFlavors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<DataFlavor> getCurrentDataFlavorsAsList( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDataFlavorSupported(DataFlavor df) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSourceActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDropAction( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Transferable getTransferable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void acceptDrop(int dropAction) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void rejectDrop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dropComplete(boolean success) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLocalTransfer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}