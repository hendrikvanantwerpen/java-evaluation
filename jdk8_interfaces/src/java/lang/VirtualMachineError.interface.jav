package java.lang;


abstract public class VirtualMachineError extends Error {
  private static final long serialVersionUID;
  public VirtualMachineError( ) {
    super( );
  }
  public VirtualMachineError(String message) {
    super(message);
  }
  public VirtualMachineError(String message, Throwable cause) {
    super(message, cause);
  }
  public VirtualMachineError(Throwable cause) {
    super(cause);
  }
}