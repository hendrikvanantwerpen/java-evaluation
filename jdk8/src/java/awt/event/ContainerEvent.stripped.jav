package java.awt.event;

import java.awt.Container;
import java.awt.Component;

public class ContainerEvent extends ComponentEvent {
  public static final int CONTAINER_FIRST;
  public static final int CONTAINER_LAST;
  public static final int COMPONENT_ADDED;
  public static final int COMPONENT_REMOVED;
  public ContainerEvent(Component source,int id, Component child) {
    super(source, id);
  }
  public Container getContainer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getChild( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}