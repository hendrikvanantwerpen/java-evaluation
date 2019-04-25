package java.awt.geom;

import java.awt.Shape;
import java.awt.Rectangle;

public abstract class RectangularShape implements Shape, Cloneable {
  protected RectangularShape( ) {
  }
  public abstract double getX( ) ;
  public abstract double getY( ) ;
  public abstract double getWidth( ) ;
  public abstract double getHeight( ) ;
  public double getMinX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getMinY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getMaxX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getMaxY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getCenterX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getCenterY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getFrame( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean isEmpty( ) ;
  public abstract void setFrame(double x,double y,double w, double h) ;
  public void setFrame(Point2D loc, Dimension2D size) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrame(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrameFromDiagonal(double x1,double y1,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrameFromDiagonal(Point2D p1, Point2D p2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrameFromCenter(double centerX,double centerY,double cornerX, double cornerY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrameFromCenter(Point2D center, Point2D corner) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at, double flatness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}