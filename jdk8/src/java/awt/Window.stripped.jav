package java.awt;

import java.awt.event.*;
import java.awt.im.InputContext;
import java.awt.image.BufferStrategy;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.accessibility.*;

public class Window extends Container implements Accessible {
  public static enum Type {
    NORMAL, UTILITY, POPUP
  }
  Window(GraphicsConfiguration gc) {
  }
  Window( ) throws HeadlessException{
  }
  public Window(Frame owner) {
    this(owner == null ? (GraphicsConfiguration ) null : owner. getGraphicsConfiguration( ));
  }
  public Window(Window owner) {
    this(owner == null ? (GraphicsConfiguration ) null : owner. getGraphicsConfiguration( ));
  }
  public Window(Window owner, GraphicsConfiguration gc) {
    this(gc);
  }
  public java. util. List<Image> getIconImages( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setIconImages(java. util. List<? extends Image> icons) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIconImage(Image image) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void pack( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinimumSize(Dimension minimumSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(Dimension d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reshape(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setVisible(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void show( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void hide( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void dispose( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void toFront( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void toBack( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Toolkit getToolkit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String getWarningString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputContext getInputContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCursor(Cursor cursor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Window getOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Window [] getOwnedWindows( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Window [] getWindows( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Window [] getOwnerlessWindows( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setModalExclusionType(Dialog. ModalExclusionType exclusionType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dialog. ModalExclusionType getModalExclusionType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addWindowListener(WindowListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addWindowStateListener(WindowStateListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addWindowFocusListener(WindowFocusListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeWindowListener(WindowListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeWindowStateListener(WindowStateListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeWindowFocusListener(WindowFocusListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized WindowListener [] getWindowListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized WindowFocusListener [] getWindowFocusListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized WindowStateListener [] getWindowStateListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setAlwaysOnTop(boolean alwaysOnTop) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAlwaysOnTopSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isAlwaysOnTop( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getFocusOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Component getMostRecentFocusOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isActive( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocused( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setFocusCycleRoot(boolean focusCycleRoot) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isFocusCycleRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Container getFocusCycleRootAncestor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean isFocusableWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getFocusableWindowState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFocusableWindowState(boolean focusableWindowState) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAutoRequestFocus(boolean autoRequestFocus) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAutoRequestFocus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValidateRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean postEvent(Event e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isShowing( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void applyResourceBundle(ResourceBundle rb) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void applyResourceBundle(String rbName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setType(Type type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Type getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocationRelativeTo(Component c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void createBufferStrategy(int numBuffers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void createBufferStrategy(int numBuffers, BufferCapabilities caps) throws AWTException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferStrategy getBufferStrategy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocationByPlatform(boolean locationByPlatform) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLocationByPlatform( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBounds(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBounds(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getOpacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOpacity(float opacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getShape( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setShape(Shape shape) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color getBackground( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBackground(Color bgColor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isOpaque( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void paint(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}