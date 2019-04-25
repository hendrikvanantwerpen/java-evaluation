package java.awt.event;

import java.awt.ActiveEvent;
import java.awt.AWTEvent;

public class InvocationEvent extends AWTEvent implements ActiveEvent {
  public static final int INVOCATION_FIRST;
  public static final int INVOCATION_DEFAULT;
  public static final int INVOCATION_LAST;
  public InvocationEvent(Object source, Runnable runnable) {
    this(source, INVOCATION_DEFAULT, runnable, null, null, false);
  }
  public InvocationEvent(Object source,Runnable runnable,Object notifier, boolean catchThrowables) {
    this(source, INVOCATION_DEFAULT, runnable, notifier, null, catchThrowables);
  }
  public InvocationEvent(Object source,Runnable runnable,Runnable listener, boolean catchThrowables) {
    this(source, INVOCATION_DEFAULT, runnable, null, listener, catchThrowables);
  }
  protected InvocationEvent(Object source,int id,Runnable runnable,Object notifier, boolean catchThrowables) {
    this(source, id, runnable, notifier, null, catchThrowables);
  }
  private InvocationEvent(Object source,int id,Runnable runnable,Object notifier,Runnable listener, boolean catchThrowables) {
    super(source, id);
  }
  public void dispatch( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Exception getException( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Throwable getThrowable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getWhen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDispatched( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}