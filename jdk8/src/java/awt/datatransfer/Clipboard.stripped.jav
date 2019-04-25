package java.awt.datatransfer;

import java.io.IOException;

public class Clipboard {
  public Clipboard(String name) {
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setContents(Transferable contents, ClipboardOwner owner) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Transferable getContents(Object requestor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DataFlavor [] getAvailableDataFlavors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDataFlavorAvailable(DataFlavor flavor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addFlavorListener(FlavorListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeFlavorListener(FlavorListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized FlavorListener [] getFlavorListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}