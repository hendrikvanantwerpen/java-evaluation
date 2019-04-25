package java.awt.geom;

import java.io.Serializable;

public abstract class Arc2D extends RectangularShape {
  public final static int OPEN;
  public final static int CHORD;
  public final static int PIE;
  public static class Float extends Arc2D implements Serializable {
    public float x;
    public float y;
    public float width;
    public float height;
    public float start;
    public float extent;
    public Float( ) {
      super(OPEN);
    }
    public Float(int type) {
      super(type);
    }
    public Float(float x,float y,float w,float h,float start,float extent, int type) {
      super(type);
    }
    public Float(Rectangle2D ellipseBounds,float start,float extent, int type) {
      super(type);
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
    public double getAngleStart( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getAngleExtent( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isEmpty( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setArc(double x,double y,double w,double h,double angSt,double angExt, int closure) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setAngleStart(double angSt) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setAngleExtent(double angExt) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends Arc2D implements Serializable {
    public double x;
    public double y;
    public double width;
    public double height;
    public double start;
    public double extent;
    public Double( ) {
      super(OPEN);
    }
    public Double(int type) {
      super(type);
    }
    public Double(double x,double y,double w,double h,double start,double extent, int type) {
      super(type);
    }
    public Double(Rectangle2D ellipseBounds,double start,double extent, int type) {
      super(type);
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
    public double getAngleStart( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getAngleExtent( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isEmpty( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setArc(double x,double y,double w,double h,double angSt,double angExt, int closure) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setAngleStart(double angSt) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setAngleExtent(double angExt) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected Arc2D( ) {
    this(OPEN);
  }
  protected Arc2D(int type) {
  }
  public abstract double getAngleStart( ) ;
  public abstract double getAngleExtent( ) ;
  public int getArcType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getStartPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Point2D getEndPoint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setArc(double x,double y,double w,double h,double angSt,double angExt, int closure) ;
  public void setArc(Point2D loc,Dimension2D size,double angSt,double angExt, int closure) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setArc(Rectangle2D rect,double angSt,double angExt, int closure) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setArc(Arc2D a) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setArcByCenter(double x,double y,double radius,double angSt,double angExt, int closure) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setArcByTangent(Point2D p1,Point2D p2,Point2D p3, double radius) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setAngleStart(double angSt) ;
  public abstract void setAngleExtent(double angExt) ;
  public void setAngleStart(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAngles(double x1,double y1,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAngles(Point2D p1, Point2D p2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setArcType(int type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrame(double x,double y,double w, double h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsAngle(double angle) {
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
  public boolean contains(Rectangle2D r) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PathIterator getPathIterator(AffineTransform at) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}