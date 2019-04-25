package java.awt.geom;

import java.awt.Shape;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class Path2D implements Shape, Cloneable {
  public static final int WIND_EVEN_ODD;
  public static final int WIND_NON_ZERO;
  Path2D( ) {
  }
  Path2D(int rule, int initialTypes) {
  }
  public static class Float extends Path2D implements Serializable {
    public Float( ) {
      this(WIND_NON_ZERO, INIT_SIZE);
    }
    public Float(int rule) {
      this(rule, INIT_SIZE);
    }
    public Float(int rule, int initialCapacity) {
      super(rule, initialCapacity);
    }
    public Float(Shape s) {
      this(s, null);
    }
    public Float(Shape s, AffineTransform at) {
    }
    public final synchronized void moveTo(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void moveTo(float x, float y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void lineTo(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void lineTo(float x, float y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void quadTo(double x1,double y1,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void quadTo(float x1,float y1,float x2, float y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void curveTo(double x1,double y1,double x2,double y2,double x3, double y3) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void curveTo(float x1,float y1,float x2,float y2,float x3, float y3) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final void append(PathIterator pi, boolean connect) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final void transform(AffineTransform at) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final PathIterator getPathIterator(AffineTransform at) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final Object clone( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends Path2D implements Serializable {
    public Double( ) {
      this(WIND_NON_ZERO, INIT_SIZE);
    }
    public Double(int rule) {
      this(rule, INIT_SIZE);
    }
    public Double(int rule, int initialCapacity) {
      super(rule, initialCapacity);
    }
    public Double(Shape s) {
      this(s, null);
    }
    public Double(Shape s, AffineTransform at) {
    }
    public final synchronized void moveTo(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void lineTo(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void quadTo(double x1,double y1,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized void curveTo(double x1,double y1,double x2,double y2,double x3, double y3) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final void append(PathIterator pi, boolean connect) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final void transform(AffineTransform at) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final synchronized Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final PathIterator getPathIterator(AffineTransform at) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final Object clone( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public abstract void moveTo(double x, double y) ;
  public abstract void lineTo(double x, double y) ;
  public abstract void quadTo(double x1,double y1,double x2, double y2) ;
  public abstract void curveTo(double x1,double y1,double x2,double y2,double x3, double y3) ;
  public final synchronized void closePath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void append(Shape s, boolean connect) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void append(PathIterator pi, boolean connect) ;
  public final synchronized int getWindingRule( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void setWindingRule(int rule) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final synchronized Point2D getCurrentPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final synchronized void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void transform(AffineTransform at) ;
  public final synchronized Shape createTransformedShape(AffineTransform at) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean contains(PathIterator pi,double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean contains(PathIterator pi, Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean contains(double x, double y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean contains(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean contains(PathIterator pi,double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean contains(PathIterator pi, Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean contains(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean contains(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean intersects(PathIterator pi,double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean intersects(PathIterator pi, Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean intersects(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean intersects(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final PathIterator getPathIterator(AffineTransform at, double flatness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Object clone( ) ;
}