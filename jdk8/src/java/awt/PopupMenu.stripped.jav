package java.awt;

import javax.accessibility.*;

public class PopupMenu extends Menu {
  public PopupMenu( ) throws HeadlessException{
    this("");
  }
  public PopupMenu(String label) throws HeadlessException{
    super(label);
  }
  public MenuContainer getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void show(Component origin,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}