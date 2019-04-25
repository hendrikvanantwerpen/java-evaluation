package java.awt.geom;

import java.io.Serializable;

public abstract class Rectangle2D extends RectangularShape {
  public static final int OUT_LEFT;
  public static final int OUT_TOP;
  public static final int OUT_RIGHT;
  public static final int OUT_BOTTOM;
  public static class Float extends Rectangle2D implements Serializable {
    public float x;
    public float y;
    public float width;
    public float height;
    public Float( ) {
    }
    public Float(float x,float y,float w, float h) {
    }
    public double getX( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getWidth( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getHeight( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isEmpty( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRect(float x,float y,float w, float h) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRect(double x,double y,double w, double h) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRect(Rectangle2D r) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int outcode(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D createIntersection(Rectangle2D r) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D createUnion(Rectangle2D r) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends Rectangle2D implements Serializable {
    public double x;
    public double y;
    public double width;
    public double height;
    public Double( ) {
    }
    public Double(double x,double y,double w, double h) {
    }
    public double getX( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getWidth( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getHeight( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isEmpty( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRect(double x,double y,double w, double h) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRect(Rectangle2D r) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int outcode(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D createIntersection(Rectangle2D r) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D createUnion(Rectangle2D r) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected Rectangle2D( ) {
  }
  public abstract void setRect(double x,double y,double w, double h) ;
  public void setRect(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersectsLine(double x1,double y1,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersectsLine(Line2D l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int outcode(double x, double y) ;
  public int outcode(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrame(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersects(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Rectangle2D createIntersection(Rectangle2D r) ;
  public static void intersect(Rectangle2D src1,Rectangle2D src2, Rectangle2D dest) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Rectangle2D createUnion(Rectangle2D r) ;
  public static void union(Rectangle2D src1,Rectangle2D src2, Rectangle2D dest) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(double newx, double newy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(Point2D pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void add(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at, double flatness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}