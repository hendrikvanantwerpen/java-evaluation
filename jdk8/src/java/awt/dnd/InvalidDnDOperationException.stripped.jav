package java.awt.dnd;


public class InvalidDnDOperationException extends IllegalStateException {
  public InvalidDnDOperationException( ) {
    super(dft_msg);
  }
  public InvalidDnDOperationException(String msg) {
    super(msg);
  }
}