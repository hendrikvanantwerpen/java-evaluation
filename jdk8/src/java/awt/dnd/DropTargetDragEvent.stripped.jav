package java.awt.dnd;

import java.awt.Point;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.List;

public class DropTargetDragEvent extends DropTargetEvent {
  public DropTargetDragEvent(DropTargetContext dtc,Point cursorLocn,int dropAction, int srcActions) {
    super(dtc);
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
  public void acceptDrag(int dragOperation) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void rejectDrag( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}