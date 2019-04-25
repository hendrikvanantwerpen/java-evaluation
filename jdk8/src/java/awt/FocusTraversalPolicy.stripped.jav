package java.awt;


public abstract class FocusTraversalPolicy {
  public abstract Component getComponentAfter(Container aContainer, Component aComponent) ;
  public abstract Component getComponentBefore(Container aContainer, Component aComponent) ;
  public abstract Component getFirstComponent(Container aContainer) ;
  public abstract Component getLastComponent(Container aContainer) ;
  public abstract Component getDefaultComponent(Container aContainer) ;
  public Component getInitialComponent(Window window) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}