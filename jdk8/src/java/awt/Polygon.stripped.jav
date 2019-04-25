package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Polygon implements Shape, java. io. Serializable {
  public int npoints;
  public int xpoints[];
  public int ypoints[];
  public Polygon( ) {
  }
  public Polygon(int xpoints[],int ypoints[], int npoints) {
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void invalidate( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void translate(int deltaX, int deltaY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPoint(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle getBoundingBox( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean inside(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at, double flatness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}