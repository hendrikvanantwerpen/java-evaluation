package java.awt.dnd;


public class DragSourceDragEvent extends DragSourceEvent {
  public DragSourceDragEvent(DragSourceContext dsc,int dropAction,int action, int modifiers) {
    super(dsc);
  }
  public DragSourceDragEvent(DragSourceContext dsc,int dropAction,int action,int modifiers,int x, int y) {
    super(dsc, x, y);
  }
  public int getTargetActions( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getGestureModifiers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getGestureModifiersEx( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getUserAction( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDropAction( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}