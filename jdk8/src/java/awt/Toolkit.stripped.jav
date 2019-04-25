package java.awt;

import java.util.Properties;
import java.awt.event.*;
import java.awt.peer.*;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.ColorModel;
import java.awt.datatransfer.Clipboard;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragGestureRecognizer;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.InvalidDnDOperationException;
import java.awt.dnd.peer.DragSourceContextPeer;
import java.net.URL;
import java.util.*;
import java.beans.PropertyChangeListener;

public abstract class Toolkit {
  public void setDynamicLayout(final boolean dynamic) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDynamicLayoutActive( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Dimension getScreenSize( ) throws HeadlessException ;
  public abstract int getScreenResolution( ) throws HeadlessException ;
  public Insets getScreenInsets(GraphicsConfiguration gc) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract ColorModel getColorModel( ) throws HeadlessException ;
  public abstract String [] getFontList( ) ;
  public abstract FontMetrics getFontMetrics(Font font) ;
  public abstract void sync( ) ;
  public static synchronized Toolkit getDefaultToolkit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Image getImage(String filename) ;
  public abstract Image getImage(URL url) ;
  public abstract Image createImage(String filename) ;
  public abstract Image createImage(URL url) ;
  public abstract boolean prepareImage(Image image,int width,int height, ImageObserver observer) ;
  public abstract int checkImage(Image image,int width,int height, ImageObserver observer) ;
  public abstract Image createImage(ImageProducer producer) ;
  public Image createImage(byte [] imagedata) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Image createImage(byte [] imagedata,int imageoffset, int imagelength) ;
  public abstract PrintJob getPrintJob(Frame frame,String jobtitle, Properties props) ;
  public PrintJob getPrintJob(Frame frame,String jobtitle,JobAttributes jobAttributes, PageAttributes pageAttributes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void beep( ) ;
  public abstract Clipboard getSystemClipboard( ) throws HeadlessException ;
  public Clipboard getSystemSelection( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMenuShortcutKeyMask( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getLockingKeyState(int keyCode) throws UnsupportedOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLockingKeyState(int keyCode, boolean on) throws UnsupportedOperationException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Cursor createCustomCursor(Image cursor,Point hotSpot, String name) throws IndexOutOfBoundsException, HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getBestCursorSize(int preferredWidth, int preferredHeight) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getMaximumCursorColors( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isFrameStateSupported(int state) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getProperty(String key, String defaultValue) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final EventQueue getSystemEventQueue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract DragSourceContextPeer createDragSourceContextPeer(DragGestureEvent dge) throws InvalidDnDOperationException ;
  public <T extends DragGestureRecognizer> T createDragGestureRecognizer(Class<T> abstractRecognizerClass,DragSource ds,Component c,int srcActions, DragGestureListener dgl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final synchronized Object getDesktopProperty(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPropertyChangeListener(String name, PropertyChangeListener pcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePropertyChangeListener(String name, PropertyChangeListener pcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyChangeListener [] getPropertyChangeListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyChangeListener [] getPropertyChangeListeners(String propertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAlwaysOnTopSupported( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean isModalityTypeSupported(Dialog. ModalityType modalityType) ;
  public abstract boolean isModalExclusionTypeSupported(Dialog. ModalExclusionType modalExclusionType) ;
  public void addAWTEventListener(AWTEventListener listener, long eventMask) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeAWTEventListener(AWTEventListener listener) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AWTEventListener [] getAWTEventListeners( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AWTEventListener [] getAWTEventListeners(long eventMask) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Map<java. awt. font. TextAttribute, ?> mapInputMethodHighlight(InputMethodHighlight highlight) throws HeadlessException ;
  public boolean areExtraMouseButtonsEnabled( ) throws HeadlessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}