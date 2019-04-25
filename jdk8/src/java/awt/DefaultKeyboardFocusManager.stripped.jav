package java.awt;

import java.awt.event.KeyEvent;

public class DefaultKeyboardFocusManager extends KeyboardFocusManager {
  public boolean dispatchEvent(AWTEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean dispatchKeyEvent(KeyEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean postProcessKeyEvent(KeyEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void processKeyEvent(Component focusedComponent, KeyEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void focusPreviousComponent(Component aComponent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void focusNextComponent(Component aComponent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void upFocusCycle(Component aComponent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void downFocusCycle(Container aContainer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}