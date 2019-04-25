package java.awt;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.EventListener;
import java.util.Set;
import java.awt.peer.ComponentPeer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.ColorModel;
import java.awt.image.VolatileImage;
import java.awt.event.*;
import java.io.Serializable;
import java.beans.PropertyChangeListener;
import java.awt.event.InputMethodListener;
import java.awt.im.InputContext;
import java.awt.im.InputMethodRequests;
import java.awt.dnd.DropTarget;
import javax.accessibility.*;

public abstract class Component implements ImageObserver, MenuContainer, Serializable {
  public static final float TOP_ALIGNMENT;
  public static final float CENTER_ALIGNMENT;
  public static final float BOTTOM_ALIGNMENT;
  public static final float LEFT_ALIGNMENT;
  public static final float RIGHT_ALIGNMENT;
  public enum BaselineResizeBehavior {
    CONSTANT_ASCENT, CONSTANT_DESCENT, CENTER_OFFSET, OTHER
  }
  protected Component( ) {
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setName(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Container getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ComponentPeer getPeer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setDropTarget(DropTarget dt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized DropTarget getDropTarget( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GraphicsConfiguration getGraphicsConfiguration( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Object getTreeLock( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Toolkit getToolkit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValid( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDisplayable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isVisible( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getMousePosition( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isShowing( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEnabled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setEnabled(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void enable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void enable(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void disable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDoubleBuffered( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void enableInputMethods(boolean enable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setVisible(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void show( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void show(boolean b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void hide( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color getForeground( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setForeground(Color c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isForegroundSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Color getBackground( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBackground(Color c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBackgroundSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Font getFont( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFont(Font f) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFontSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocale(Locale l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ColorModel getColorModel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLocationOnScreen( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point location( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void move(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void resize(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(Dimension d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void resize(Dimension d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle bounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBounds(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reshape(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBounds(Rectangle r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds(Rectangle rv) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getSize(Dimension rv) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLocation(Point rv) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isOpaque( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLightweight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPreferredSize(Dimension preferredSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPreferredSizeSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getPreferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension preferredSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMinimumSize(Dimension minimumSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMinimumSizeSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getMinimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension minimumSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaximumSize(Dimension maximumSize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMaximumSizeSet( ) {
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
  public int getBaseline(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BaselineResizeBehavior getBaselineResizeBehavior( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void doLayout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void layout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void validate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void invalidate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void revalidate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Graphics getGraphics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public FontMetrics getFontMetrics(Font font) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCursor(Cursor cursor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Cursor getCursor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCursorSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void paint(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void update(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void paintAll(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void repaint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void repaint(long tm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void repaint(int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void repaint(long tm,int x,int y,int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void print(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void printAll(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean imageUpdate(Image img,int infoflags,int x,int y,int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Image createImage(ImageProducer producer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Image createImage(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VolatileImage createVolatileImage(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VolatileImage createVolatileImage(int width,int height, ImageCapabilities caps) throws AWTException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean prepareImage(Image image, ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean prepareImage(Image image,int width,int height, ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int checkImage(Image image, ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int checkImage(Image image,int width,int height, ImageObserver observer) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIgnoreRepaint(boolean ignoreRepaint) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getIgnoreRepaint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean inside(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Point p) {
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
  public void deliverEvent(Event e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void dispatchEvent(AWTEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean postEvent(Event e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addComponentListener(ComponentListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeComponentListener(ComponentListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ComponentListener [] getComponentListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addFocusListener(FocusListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeFocusListener(FocusListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized FocusListener [] getFocusListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addHierarchyListener(HierarchyListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeHierarchyListener(HierarchyListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized HierarchyListener [] getHierarchyListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addHierarchyBoundsListener(HierarchyBoundsListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeHierarchyBoundsListener(HierarchyBoundsListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized HierarchyBoundsListener [] getHierarchyBoundsListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addKeyListener(KeyListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeKeyListener(KeyListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized KeyListener [] getKeyListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addMouseListener(MouseListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeMouseListener(MouseListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized MouseListener [] getMouseListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addMouseMotionListener(MouseMotionListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeMouseMotionListener(MouseMotionListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized MouseMotionListener [] getMouseMotionListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addMouseWheelListener(MouseWheelListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeMouseWheelListener(MouseWheelListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized MouseWheelListener [] getMouseWheelListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addInputMethodListener(InputMethodListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeInputMethodListener(InputMethodListener l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized InputMethodListener [] getInputMethodListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends EventListener> T [] getListeners(Class<T> listenerType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputMethodRequests getInputMethodRequests( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputContext getInputContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean handleEvent(Event evt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean mouseDown(Event evt,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean mouseDrag(Event evt,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean mouseUp(Event evt,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean mouseMove(Event evt,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean mouseEnter(Event evt,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean mouseExit(Event evt,int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean keyDown(Event evt, int key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean keyUp(Event evt, int key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean action(Event evt, Object what) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean gotFocus(Event evt, Object what) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean lostFocus(Event evt, Object what) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusTraversable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFocusable(boolean focusable) {
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
  public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getFocusTraversalKeysEnabled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void requestFocus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean requestFocusInWindow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  ;
  public Container getFocusCycleRootAncestor( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusCycleRoot(Container container) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transferFocus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void nextFocus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transferFocusBackward( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transferFocusUpCycle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasFocus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFocusOwner( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(PopupMenu popup) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(MenuComponent popup) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintStream out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintStream out, int indent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintWriter out) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void list(PrintWriter out, int indent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyChangeListener [] getPropertyChangeListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyChangeListener [] getPropertyChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,byte oldValue, byte newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,char oldValue, char newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,short oldValue, short newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,long oldValue, long newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,float oldValue, float newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void firePropertyChange(String propertyName,double oldValue, double newValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setComponentOrientation(ComponentOrientation o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ComponentOrientation getComponentOrientation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void applyComponentOrientation(ComponentOrientation orientation) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}