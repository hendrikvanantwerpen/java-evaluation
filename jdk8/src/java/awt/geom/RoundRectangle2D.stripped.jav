package java.awt.geom;

import java.io.Serializable;

public abstract class RoundRectangle2D extends RectangularShape {
  public static class Float extends RoundRectangle2D implements Serializable {
    public float x;
    public float y;
    public float width;
    public float height;
    public float arcwidth;
    public float archeight;
    public Float( ) {
    }
    public Float(float x,float y,float w,float h,float arcw, float arch) {
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
    public double getArcWidth( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getArcHeight( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isEmpty( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRoundRect(float x,float y,float w,float h,float arcw, float arch) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRoundRect(double x,double y,double w,double h,double arcw, double arch) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRoundRect(RoundRectangle2D rr) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends RoundRectangle2D implements Serializable {
    public double x;
    public double y;
    public double width;
    public double height;
    public double arcwidth;
    public double archeight;
    public Double( ) {
    }
    public Double(double x,double y,double w,double h,double arcw, double arch) {
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
    public double getArcWidth( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getArcHeight( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean isEmpty( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRoundRect(double x,double y,double w,double h,double arcw, double arch) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setRoundRect(RoundRectangle2D rr) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected RoundRectangle2D( ) {
  }
  public abstract double getArcWidth( ) ;
  public abstract double getArcHeight( ) ;
  public abstract void setRoundRect(double x,double y,double w,double h,double arcWidth, double arcHeight) ;
  public void setRoundRect(RoundRectangle2D rr) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setFrame(double x,double y,double w, double h) {
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