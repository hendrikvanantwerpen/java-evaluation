package java.awt.event;

import java.awt.Component;

public class FocusEvent extends ComponentEvent {
  public static final int FOCUS_FIRST;
  public static final int FOCUS_LAST;
  public static final int FOCUS_GAINED;
  public static final int FOCUS_LOST;
  public FocusEvent(Component source,int id,boolean temporary, Component opposite) {
    super(source, id);
  }
  public FocusEvent(Component source,int id, boolean temporary) {
    this(source, id, temporary, null);
  }
  public FocusEvent(Component source, int id) {
    this(source, id, false);
  }
  public boolean isTemporary( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getOppositeComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}