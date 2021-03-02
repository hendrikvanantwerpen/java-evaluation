package java.util.concurrent;


public class RejectedExecutionException extends RuntimeException {
  private static final long serialVersionUID;
  public RejectedExecutionException( ) {
  }
  public RejectedExecutionException(String message) {
    super(message);
  }
  public RejectedExecutionException(String message, Throwable cause) {
    super(message, cause);
  }
  public RejectedExecutionException(Throwable cause) {
    super(cause);
  }
}