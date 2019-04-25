package java.awt;

import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.util.Set;

public abstract class KeyboardFocusManager implements KeyEventDispatcher, KeyEventPostProcessor {
  public static final int FORWARD_TRAVERSAL_KEYS;
  public static final int BACKWARD_TRAVERSAL_KEYS;
  public static final int UP_CYCLE_TRAVERSAL_KEYS;
  public static final int DOWN_CYCLE_TRAVERSAL_KEYS;
  public static KeyboardFocusManager getCurrentKeyboardFocusManager( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setCurrentKeyboardFocusManager(KeyboardFocusManager newManager) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public KeyboardFocusManager( ) {
  }
  public Component getFocusOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clearFocusOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clearGlobalFocusOwner( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getPermanentFocusOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Window getFocusedWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Window getActiveWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized FocusTraversalPolicy getDefaultFocusTraversalPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDefaultFocusTraversalPolicy(FocusTraversalPolicy defaultPolicy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDefaultFocusTraversalKeys(int id, Set<? extends AWTKeyStroke> keystrokes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<AWTKeyStroke> getDefaultFocusTraversalKeys(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Container getCurrentFocusCycleRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setGlobalCurrentFocusCycleRoot(Container newFocusCycleRoot) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized PropertyChangeListener [] getPropertyChangeListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized PropertyChangeListener [] getPropertyChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addVetoableChangeListener(VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeVetoableChangeListener(VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized VetoableChangeListener [] getVetoableChangeListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addVetoableChangeListener(String propertyName, VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeVetoableChangeListener(String propertyName, VetoableChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized VetoableChangeListener [] getVetoableChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addKeyEventDispatcher(KeyEventDispatcher dispatcher) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeKeyEventDispatcher(KeyEventDispatcher dispatcher) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addKeyEventPostProcessor(KeyEventPostProcessor processor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeKeyEventPostProcessor(KeyEventPostProcessor processor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean dispatchEvent(AWTEvent e) ;
  public final void redispatchEvent(Component target, AWTEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean dispatchKeyEvent(KeyEvent e) ;
  public abstract boolean postProcessKeyEvent(KeyEvent e) ;
  public abstract void processKeyEvent(Component focusedComponent, KeyEvent e) ;
  public abstract void focusNextComponent(Component aComponent) ;
  public abstract void focusPreviousComponent(Component aComponent) ;
  public abstract void upFocusCycle(Component aComponent) ;
  public abstract void downFocusCycle(Container aContainer) ;
  public final void focusNextComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void focusPreviousComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void upFocusCycle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void downFocusCycle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}