package java.awt.geom;

import java.io.Serializable;

public abstract class Point2D implements Cloneable {
  public static class Float extends Point2D implements Serializable {
    public float x;
    public float y;
    public Float( ) {
    }
    public Float(float x, float y) {
    }
    public double getX( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setLocation(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setLocation(float x, float y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static class Double extends Point2D implements Serializable {
    public double x;
    public double y;
    public Double( ) {
    }
    public Double(double x, double y) {
    }
    public double getX( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public double getY( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public void setLocation(double x, double y) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  protected Point2D( ) {
  }
  public abstract double getX( ) ;
  public abstract double getY( ) ;
  public abstract void setLocation(double x, double y) ;
  public void setLocation(Point2D p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double distanceSq(double x1,double y1,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static double distance(double x1,double y1,double x2, double y2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double distanceSq(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double distanceSq(Point2D pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double distance(double px, double py) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double distance(Point2D pt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}