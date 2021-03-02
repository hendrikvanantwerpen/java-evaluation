package java.util.concurrent;


public class CancellationException extends IllegalStateException {
  private static final long serialVersionUID;
  public CancellationException( ) {
  }
  public CancellationException(String message) {
    super(message);
  }
}