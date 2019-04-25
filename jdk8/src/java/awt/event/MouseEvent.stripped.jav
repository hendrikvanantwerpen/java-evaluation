package java.awt.event;

import java.awt.Component;
import java.awt.Point;

public class MouseEvent extends InputEvent {
  public static final int MOUSE_FIRST;
  public static final int MOUSE_LAST;
  public static final int MOUSE_CLICKED;
  public static final int MOUSE_PRESSED;
  public static final int MOUSE_RELEASED;
  public static final int MOUSE_MOVED;
  public static final int MOUSE_ENTERED;
  public static final int MOUSE_EXITED;
  public static final int MOUSE_DRAGGED;
  public static final int MOUSE_WHEEL;
  public static final int NOBUTTON;
  public static final int BUTTON1;
  public static final int BUTTON2;
  public static final int BUTTON3;
  public Point getLocationOnScreen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getXOnScreen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getYOnScreen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MouseEvent(Component source,int id,long when,int modifiers,int x,int y,int clickCount,boolean popupTrigger, int button) {
    this(source, id, when, modifiers, x, y, 0, 0, clickCount, popupTrigger, button);
  }
  public MouseEvent(Component source,int id,long when,int modifiers,int x,int y,int clickCount, boolean popupTrigger) {
    this(source, id, when, modifiers, x, y, clickCount, popupTrigger, NOBUTTON);
  }
  public int getModifiersEx( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MouseEvent(Component source,int id,long when,int modifiers,int x,int y,int xAbs,int yAbs,int clickCount,boolean popupTrigger, int button) {
    super(source, id, when, modifiers);
  }
  public int getX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void translatePoint(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getClickCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getButton( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPopupTrigger( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getMouseModifiersText(int modifiers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}