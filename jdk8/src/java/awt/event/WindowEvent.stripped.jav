package java.awt.event;

import java.awt.Window;

public class WindowEvent extends ComponentEvent {
  public static final int WINDOW_FIRST;
  public static final int WINDOW_OPENED;
  public static final int WINDOW_CLOSING;
  public static final int WINDOW_CLOSED;
  public static final int WINDOW_ICONIFIED;
  public static final int WINDOW_DEICONIFIED;
  public static final int WINDOW_ACTIVATED;
  public static final int WINDOW_DEACTIVATED;
  public static final int WINDOW_GAINED_FOCUS;
  public static final int WINDOW_LOST_FOCUS;
  public static final int WINDOW_STATE_CHANGED;
  public static final int WINDOW_LAST;
  public WindowEvent(Window source,int id,Window opposite,int oldState, int newState) {
    super(source, id);
  }
  public WindowEvent(Window source,int id, Window opposite) {
    this(source, id, opposite, 0, 0);
  }
  public WindowEvent(Window source,int id,int oldState, int newState) {
    this(source, id, null, oldState, newState);
  }
  public WindowEvent(Window source, int id) {
    this(source, id, null, 0, 0);
  }
  public Window getWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Window getOppositeWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOldState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNewState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}