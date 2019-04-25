package java.awt.dnd;

import java.awt.Point;
import java.util.EventObject;

public class DragSourceEvent extends EventObject {
  public DragSourceEvent(DragSourceContext dsc) {
    super(dsc);
  }
  public DragSourceEvent(DragSourceContext dsc,int x, int y) {
    super(dsc);
  }
  public DragSourceContext getDragSourceContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}