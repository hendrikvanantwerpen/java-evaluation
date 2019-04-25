package java.awt;

import java.util.EventObject;
import java.awt.event.*;

public abstract class AWTEvent extends EventObject {
  public final static long COMPONENT_EVENT_MASK;
  public final static long CONTAINER_EVENT_MASK;
  public final static long FOCUS_EVENT_MASK;
  public final static long KEY_EVENT_MASK;
  public final static long MOUSE_EVENT_MASK;
  public final static long MOUSE_MOTION_EVENT_MASK;
  public final static long WINDOW_EVENT_MASK;
  public final static long ACTION_EVENT_MASK;
  public final static long ADJUSTMENT_EVENT_MASK;
  public final static long ITEM_EVENT_MASK;
  public final static long TEXT_EVENT_MASK;
  public final static long INPUT_METHOD_EVENT_MASK;
  public final static long PAINT_EVENT_MASK;
  public final static long INVOCATION_EVENT_MASK;
  public final static long HIERARCHY_EVENT_MASK;
  public final static long HIERARCHY_BOUNDS_EVENT_MASK;
  public final static long MOUSE_WHEEL_EVENT_MASK;
  public final static long WINDOW_STATE_EVENT_MASK;
  public final static long WINDOW_FOCUS_EVENT_MASK;
  public final static int RESERVED_ID_MAX;
  public AWTEvent(Event event) {
    this(event.target, event.id);
  }
  public AWTEvent(Object source, int id) {
    super(source);
  }
  public void setSource(Object newSource) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getID( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}