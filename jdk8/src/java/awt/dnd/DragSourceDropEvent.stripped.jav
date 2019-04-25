package java.awt.dnd;


public class DragSourceDropEvent extends DragSourceEvent {
  public DragSourceDropEvent(DragSourceContext dsc,int action, boolean success) {
    super(dsc);
  }
  public DragSourceDropEvent(DragSourceContext dsc,int action,boolean success,int x, int y) {
    super(dsc, x, y);
  }
  public DragSourceDropEvent(DragSourceContext dsc) {
    super(dsc);
  }
  public boolean getDropSuccess( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDropAction( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}