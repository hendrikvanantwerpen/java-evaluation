package java.awt;

import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.EventListener;
import java.util.Set;
import javax.accessibility.*;

public class Container extends Component {
  public Container( ) {
  }
  public int getComponentCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int countComponents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getComponent(int n) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component [] getComponents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Insets getInsets( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Insets insets( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component add(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component add(String name, Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component add(Component comp, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setComponentZOrder(Component comp, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getComponentZOrder(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(Component comp, Object constraints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(Component comp,Object constraints, int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(Component comp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeAll( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public LayoutManager getLayout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLayout(LayoutManager mgr) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void doLayout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void layout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValidateRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void invalidate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void validate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFont(Font f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMaximumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAlignmentX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAlignmentY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void paint(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void paintComponents(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void printComponents(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addContainerListener(ContainerListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeContainerListener(ContainerListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ContainerListener [] getContainerListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void deliverEvent(Event e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getComponentAt(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component locate(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getComponentAt(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getMousePosition(boolean allowChildren) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component findComponentAt(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component findComponentAt(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAncestorOf(Component c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintStream out, int indent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintWriter out, int indent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFocusTraversalKeys(int id, Set<? extends AWTKeyStroke> keystrokes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean areFocusTraversalKeysSet(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusCycleRoot(Container container) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFocusTraversalPolicy(FocusTraversalPolicy policy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FocusTraversalPolicy getFocusTraversalPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusTraversalPolicySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFocusCycleRoot(boolean focusCycleRoot) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusCycleRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setFocusTraversalPolicyProvider(boolean provider) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isFocusTraversalPolicyProvider( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transferFocusDownCycle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void applyComponentOrientation(ComponentOrientation o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}