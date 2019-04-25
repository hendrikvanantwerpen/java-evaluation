package java.awt.datatransfer;


public class UnsupportedFlavorException extends Exception {
  public UnsupportedFlavorException(DataFlavor flavor) {
    super(flavor != null ? flavor. getHumanPresentableName( ) : null);
  }
}