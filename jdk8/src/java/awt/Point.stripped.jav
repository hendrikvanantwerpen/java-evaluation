package java.awt;

import java.awt.geom.Point2D;

public class Point extends Point2D implements java. io. Serializable {
  public int x;
  public int y;
  public Point( ) {
    this(0, 0);
  }
  public Point(Point p) {
    this(p.x, p.y);
  }
  public Point(int x, int y) {
  }
  public double getX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(Point p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLocation(double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void move(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void translate(int dx, int dy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}