package java.awt.datatransfer;

import java.io.*;

public class StringSelection implements Transferable, ClipboardOwner {
  public StringSelection(String data) {
  }
  public DataFlavor [] getTransferDataFlavors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDataFlavorSupported(DataFlavor flavor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void lostOwnership(Clipboard clipboard, Transferable contents) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}