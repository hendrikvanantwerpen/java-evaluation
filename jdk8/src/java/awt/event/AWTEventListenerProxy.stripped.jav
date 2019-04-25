package java.awt.event;

import java.util.EventListenerProxy;
import java.awt.AWTEvent;

public class AWTEventListenerProxy extends EventListenerProxy<AWTEventListener> implements AWTEventListener {
  public AWTEventListenerProxy(long eventMask, AWTEventListener listener) {
    super(listener);
  }
  public void eventDispatched(AWTEvent event) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getEventMask( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}