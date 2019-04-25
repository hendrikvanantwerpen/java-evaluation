package java.awt;

import java.awt.event.*;
import javax.accessibility.*;

public class ScrollPane extends Container implements Accessible {
  public static final int SCROLLBARS_AS_NEEDED;
  public static final int SCROLLBARS_ALWAYS;
  public static final int SCROLLBARS_NEVER;
  public ScrollPane( ) throws HeadlessException{
    this(SCROLLBARS_AS_NEEDED);
  }
  @ConstructorProperties({"scrollbarDisplayPolicy"}) public ScrollPane(int scrollbarDisplayPolicy) throws HeadlessException{
  }
  public int getScrollbarDisplayPolicy( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getViewportSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getHScrollbarHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getVScrollbarWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Adjustable getVAdjustable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Adjustable getHAdjustable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setScrollPosition(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setScrollPosition(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getScrollPosition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setLayout(LayoutManager mgr) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void doLayout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void layout( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void printComponents(Graphics g) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNotify( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String paramString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setWheelScrollingEnabled(boolean handleWheel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isWheelScrollingEnabled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AccessibleContext getAccessibleContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}