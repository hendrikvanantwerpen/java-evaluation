package java.lang;


public abstract class ClassValue<T> {
  protected ClassValue( ) {
  }
  public T get(Class<?> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(Class<?> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}