package java.lang;


public class AssertionError extends Error {
  private static final long serialVersionUID;
  public AssertionError( ) {
  }
  private AssertionError(String detailMessage) {
    super(detailMessage);
  }
  public AssertionError(Object detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(boolean detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(char detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(int detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(long detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(float detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(double detailMessage) {
    this(String. valueOf(detailMessage));
  }
  public AssertionError(String message, Throwable cause) {
    super(message, cause);
  }
}