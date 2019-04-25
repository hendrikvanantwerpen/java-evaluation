package java.util;


public abstract class EventListenerProxy<T extends EventListener> implements EventListener {
  public EventListenerProxy(T listener) {
  }
  public T getListener( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}