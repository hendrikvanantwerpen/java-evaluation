package java.awt.event;

import java.awt.AWTEvent;
import java.awt.Component;

public class ComponentEvent extends AWTEvent {
  public static final int COMPONENT_FIRST;
  public static final int COMPONENT_LAST;
  public static final int COMPONENT_MOVED;
  public static final int COMPONENT_RESIZED;
  public static final int COMPONENT_SHOWN;
  public static final int COMPONENT_HIDDEN;
  public ComponentEvent(Component source, int id) {
    super(source, id);
  }
  public Component getComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}