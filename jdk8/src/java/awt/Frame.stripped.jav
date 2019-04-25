package java.awt;

import java.awt.event.*;
import javax.accessibility.*;

public class Frame extends Window implements MenuContainer {
  public static final int DEFAULT_CURSOR;
  public static final int CROSSHAIR_CURSOR;
  public static final int TEXT_CURSOR;
  public static final int WAIT_CURSOR;
  public static final int SW_RESIZE_CURSOR;
  public static final int SE_RESIZE_CURSOR;
  public static final int NW_RESIZE_CURSOR;
  public static final int NE_RESIZE_CURSOR;
  public static final int N_RESIZE_CURSOR;
  public static final int S_RESIZE_CURSOR;
  public static final int W_RESIZE_CURSOR;
  public static final int E_RESIZE_CURSOR;
  public static final int HAND_CURSOR;
  public static final int MOVE_CURSOR;
  public static final int NORMAL;
  public static final int ICONIFIED;
  public static final int MAXIMIZED_HORIZ;
  public static final int MAXIMIZED_VERT;
  public static final int MAXIMIZED_BOTH;
  public Frame( ) throws HeadlessException{
    this("");
  }
  public Frame(GraphicsConfiguration gc) {
    this("", gc);
  }
  public Frame(String title) throws HeadlessException{
  }
  public Frame(String title, GraphicsConfiguration gc) {
    super(gc);
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getTitle( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setTitle(String title) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Image getIconImage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setIconImage(Image image) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MenuBar getMenuBar( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMenuBar(MenuBar mb) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isResizable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setResizable(boolean resizable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setState(int state) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setExtendedState(int state) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getExtendedState( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setMaximizedBounds(Rectangle bounds) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getMaximizedBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUndecorated(boolean undecorated) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUndecorated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setOpacity(float opacity) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setShape(Shape shape) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBackground(Color bgColor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(MenuComponent m) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCursor(int cursorType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getCursorType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Frame [] getFrames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}