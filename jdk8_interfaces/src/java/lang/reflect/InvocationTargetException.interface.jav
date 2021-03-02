package java.lang.reflect;


public class InvocationTargetException extends ReflectiveOperationException {
  private static final long serialVersionUID;
  private Throwable target;
  protected InvocationTargetException( ) {
    super((Throwable ) null);
  }
  public InvocationTargetException(Throwable target) {
    super((Throwable ) null);
  }
  public InvocationTargetException(Throwable target, String s) {
    super(s, null);
  }
  public Throwable getTargetException( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Throwable getCause( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
}