package java.awt;

import javax.accessibility.*;

public class Panel extends Container implements Accessible {
  public Panel( ) {
    this(new FlowLayout ( ));
  }
  public Panel(LayoutManager layout) {
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}