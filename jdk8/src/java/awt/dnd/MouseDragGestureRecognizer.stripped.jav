package java.awt.dnd;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public abstract class MouseDragGestureRecognizer extends DragGestureRecognizer implements MouseListener, MouseMotionListener {
  protected MouseDragGestureRecognizer(DragSource ds,Component c,int act, DragGestureListener dgl) {
    super(ds, c, act, dgl);
  }
  protected MouseDragGestureRecognizer(DragSource ds,Component c, int act) {
    this(ds, c, act, null);
  }
  protected MouseDragGestureRecognizer(DragSource ds, Component c) {
    this(ds, c, DnDConstants.ACTION_NONE);
  }
  protected MouseDragGestureRecognizer(DragSource ds) {
    this(ds, null);
  }
  public void mouseClicked(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mousePressed(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mouseReleased(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mouseEntered(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mouseExited(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mouseDragged(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void mouseMoved(MouseEvent e) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}