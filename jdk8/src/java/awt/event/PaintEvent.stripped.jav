package java.awt.event;

import java.awt.Component;
import java.awt.Rectangle;

public class PaintEvent extends ComponentEvent {
  public static final int PAINT_FIRST;
  public static final int PAINT_LAST;
  public static final int PAINT;
  public static final int UPDATE;
  public PaintEvent(Component source,int id, Rectangle updateRect) {
    super(source, id);
  }
  public Rectangle getUpdateRect( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUpdateRect(Rectangle updateRect) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}