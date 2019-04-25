package java.awt.geom;

import java.io.Serializable;

public abstract class Ellipse2D extends RectangularShape {
  public static class Float extends Ellipse2D implements Serializable {
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
    public void setFrame(float x,float y,float w, float h) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setFrame(double x,double y,double w, double h) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends Ellipse2D implements Serializable {
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
    public void setFrame(double x,double y,double w, double h) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Rectangle2D getBounds2D( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected Ellipse2D( ) {
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