package java.awt.geom;

import java.awt.Shape;
import java.awt.Rectangle;

public class Area implements Shape, Cloneable {
  public Area( ) {
  }
  public Area(Shape s) {
  }
  public void add(Area rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void subtract(Area rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void intersect(Area rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void exclusiveOr(Area rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isPolygonal( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRectangular( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSingular( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Area other) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void transform(AffineTransform t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Area createTransformedArea(AffineTransform t) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at, double flatness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}