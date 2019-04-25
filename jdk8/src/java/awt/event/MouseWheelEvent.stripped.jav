package java.awt.event;

import java.awt.Component;

public class MouseWheelEvent extends MouseEvent {
  public static final int WHEEL_UNIT_SCROLL;
  public static final int WHEEL_BLOCK_SCROLL;
  public MouseWheelEvent(Component source,int id,long when,int modifiers,int x,int y,int clickCount,boolean popupTrigger,int scrollType,int scrollAmount, int wheelRotation) {
    this(source, id, when, modifiers, x, y, 0, 0, clickCount, popupTrigger, scrollType, scrollAmount, wheelRotation);
  }
  public MouseWheelEvent(Component source,int id,long when,int modifiers,int x,int y,int xAbs,int yAbs,int clickCount,boolean popupTrigger,int scrollType,int scrollAmount, int wheelRotation) {
    this(source, id, when, modifiers, x, y, xAbs, yAbs, clickCount, popupTrigger, scrollType, scrollAmount, wheelRotation, wheelRotation);
  }
  public MouseWheelEvent(Component source,int id,long when,int modifiers,int x,int y,int xAbs,int yAbs,int clickCount,boolean popupTrigger,int scrollType,int scrollAmount,int wheelRotation, double preciseWheelRotation) {
    super(source, id, when, modifiers, x, y, xAbs, yAbs, clickCount, popupTrigger, MouseEvent.NOBUTTON);
  }
  public int getScrollType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getScrollAmount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWheelRotation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getPreciseWheelRotation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getUnitsToScroll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}