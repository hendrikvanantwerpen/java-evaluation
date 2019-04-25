package java.awt.geom;

import java.awt.Shape;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class Line2D implements Shape, Cloneable {
  public static class Float extends Line2D implements Serializable {
    public float x1;
    public float y1;
    public float x2;
    public float y2;
    public Float( ) {
    }
    public Float(float x1,float y1,float x2, float y2) {
    }
    public Float(Point2D p1, Point2D p2) {
    }
    public double getX1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getP1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getX2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getP2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setLine(double x1,double y1,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setLine(float x1,float y1,float x2, float y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends Line2D implements Serializable {
    public double x1;
    public double y1;
    public double x2;
    public double y2;
    public Double( ) {
    }
    public Double(double x1,double y1,double x2, double y2) {
    }
    public Double(Point2D p1, Point2D p2) {
    }
    public double getX1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getP1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getX2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getP2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setLine(double x1,double y1,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected Line2D( ) {
  }
  public abstract double getX1( ) ;
  public abstract double getY1( ) ;
  public abstract Point2D getP1( ) ;
  public abstract double getX2( ) ;
  public abstract double getY2( ) ;
  public abstract Point2D getP2( ) ;
  public abstract void setLine(double x1,double y1,double x2, double y2) ;
  public void setLine(Point2D p1, Point2D p2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLine(Line2D l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int relativeCCW(double x1,double y1,double x2,double y2,double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int relativeCCW(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int relativeCCW(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean linesIntersect(double x1,double y1,double x2,double y2,double x3,double y3,double x4, double y4) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersectsLine(double x1,double y1,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean intersectsLine(Line2D l) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double ptSegDistSq(double x1,double y1,double x2,double y2,double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double ptSegDist(double x1,double y1,double x2,double y2,double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptSegDistSq(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptSegDistSq(Point2D pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptSegDist(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptSegDist(Point2D pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double ptLineDistSq(double x1,double y1,double x2,double y2,double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double ptLineDist(double x1,double y1,double x2,double y2,double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptLineDistSq(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptLineDistSq(Point2D pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptLineDist(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double ptLineDist(Point2D pt) {
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
  public Rectangle getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at, double flatness) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}