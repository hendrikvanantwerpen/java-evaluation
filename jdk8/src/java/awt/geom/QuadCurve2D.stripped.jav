package java.awt.geom;

import java.awt.Shape;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class QuadCurve2D implements Shape, Cloneable {
  public static class Float extends QuadCurve2D implements Serializable {
    public float x1;
    public float y1;
    public float ctrlx;
    public float ctrly;
    public float x2;
    public float y2;
    public Float( ) {
    }
    public Float(float x1,float y1,float ctrlx,float ctrly,float x2, float y2) {
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
    public double getCtrlX( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlY( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getCtrlPt( ) {
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
    public void setCurve(double x1,double y1,double ctrlx,double ctrly,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setCurve(float x1,float y1,float ctrlx,float ctrly,float x2, float y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends QuadCurve2D implements Serializable {
    public double x1;
    public double y1;
    public double ctrlx;
    public double ctrly;
    public double x2;
    public double y2;
    public Double( ) {
    }
    public Double(double x1,double y1,double ctrlx,double ctrly,double x2, double y2) {
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
    public double getCtrlX( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlY( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getCtrlPt( ) {
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
    public void setCurve(double x1,double y1,double ctrlx,double ctrly,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected QuadCurve2D( ) {
  }
  public abstract double getX1( ) ;
  public abstract double getY1( ) ;
  public abstract Point2D getP1( ) ;
  public abstract double getCtrlX( ) ;
  public abstract double getCtrlY( ) ;
  public abstract Point2D getCtrlPt( ) ;
  public abstract double getX2( ) ;
  public abstract double getY2( ) ;
  public abstract Point2D getP2( ) ;
  public abstract void setCurve(double x1,double y1,double ctrlx,double ctrly,double x2, double y2) ;
  public void setCurve(double [] coords, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCurve(Point2D p1,Point2D cp, Point2D p2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCurve(Point2D [] pts, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCurve(QuadCurve2D c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double getFlatnessSq(double x1,double y1,double ctrlx,double ctrly,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double getFlatness(double x1,double y1,double ctrlx,double ctrly,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double getFlatnessSq(double coords[], int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double getFlatness(double coords[], int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getFlatnessSq( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getFlatness( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void subdivide(QuadCurve2D left, QuadCurve2D right) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void subdivide(QuadCurve2D src,QuadCurve2D left, QuadCurve2D right) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void subdivide(double src[],int srcoff,double left[],int leftoff,double right[], int rightoff) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int solveQuadratic(double eqn[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int solveQuadratic(double eqn[], double res[]) {
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