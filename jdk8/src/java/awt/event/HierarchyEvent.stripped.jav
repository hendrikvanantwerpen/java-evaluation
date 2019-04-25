package java.awt.event;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Container;

public class HierarchyEvent extends AWTEvent {
  public static final int HIERARCHY_FIRST;
  public static final int HIERARCHY_CHANGED;
  public static final int ANCESTOR_MOVED;
  public static final int ANCESTOR_RESIZED;
  public static final int HIERARCHY_LAST;
  public static final int PARENT_CHANGED;
  public static final int DISPLAYABILITY_CHANGED;
  public static final int SHOWING_CHANGED;
  public HierarchyEvent(Component source,int id,Component changed, Container changedParent) {
    super(source, id);
  }
  public HierarchyEvent(Component source,int id,Component changed,Container changedParent, long changeFlags) {
    super(source, id);
  }
  public Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getChanged( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Container getChangedParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getChangeFlags( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}