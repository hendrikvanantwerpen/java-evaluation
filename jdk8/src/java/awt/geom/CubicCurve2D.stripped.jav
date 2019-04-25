package java.awt.geom;

import java.awt.Shape;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class CubicCurve2D implements Shape, Cloneable {
  public static class Float extends CubicCurve2D implements Serializable {
    public float x1;
    public float y1;
    public float ctrlx1;
    public float ctrly1;
    public float ctrlx2;
    public float ctrly2;
    public float x2;
    public float y2;
    public Float( ) {
    }
    public Float(float x1,float y1,float ctrlx1,float ctrly1,float ctrlx2,float ctrly2,float x2, float y2) {
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
    public double getCtrlX1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlY1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getCtrlP1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlX2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlY2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getCtrlP2( ) {
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
    public void setCurve(double x1,double y1,double ctrlx1,double ctrly1,double ctrlx2,double ctrly2,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setCurve(float x1,float y1,float ctrlx1,float ctrly1,float ctrlx2,float ctrly2,float x2, float y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends CubicCurve2D implements Serializable {
    public double x1;
    public double y1;
    public double ctrlx1;
    public double ctrly1;
    public double ctrlx2;
    public double ctrly2;
    public double x2;
    public double y2;
    public Double( ) {
    }
    public Double(double x1,double y1,double ctrlx1,double ctrly1,double ctrlx2,double ctrly2,double x2, double y2) {
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
    public double getCtrlX1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlY1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getCtrlP1( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlX2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getCtrlY2( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Point2D getCtrlP2( ) {
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
    public void setCurve(double x1,double y1,double ctrlx1,double ctrly1,double ctrlx2,double ctrly2,double x2, double y2) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected CubicCurve2D( ) {
  }
  public abstract double getX1( ) ;
  public abstract double getY1( ) ;
  public abstract Point2D getP1( ) ;
  public abstract double getCtrlX1( ) ;
  public abstract double getCtrlY1( ) ;
  public abstract Point2D getCtrlP1( ) ;
  public abstract double getCtrlX2( ) ;
  public abstract double getCtrlY2( ) ;
  public abstract Point2D getCtrlP2( ) ;
  public abstract double getX2( ) ;
  public abstract double getY2( ) ;
  public abstract Point2D getP2( ) ;
  public abstract void setCurve(double x1,double y1,double ctrlx1,double ctrly1,double ctrlx2,double ctrly2,double x2, double y2) ;
  public void setCurve(double [] coords, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCurve(Point2D p1,Point2D cp1,Point2D cp2, Point2D p2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCurve(Point2D [] pts, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setCurve(CubicCurve2D c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double getFlatnessSq(double x1,double y1,double ctrlx1,double ctrly1,double ctrlx2,double ctrly2,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double getFlatness(double x1,double y1,double ctrlx1,double ctrly1,double ctrlx2,double ctrly2,double x2, double y2) {
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
  public void subdivide(CubicCurve2D left, CubicCurve2D right) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void subdivide(CubicCurve2D src,CubicCurve2D left, CubicCurve2D right) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void subdivide(double src[],int srcoff,double left[],int leftoff,double right[], int rightoff) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int solveCubic(double eqn[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int solveCubic(double eqn[], double res[]) {
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