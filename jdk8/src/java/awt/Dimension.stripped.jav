package java.awt;

import java.awt.geom.Dimension2D;

public class Dimension extends Dimension2D implements java. io. Serializable {
  public int width;
  public int height;
  public Dimension( ) {
    this(0, 0);
  }
  public Dimension(Dimension d) {
    this(d.width, d.height);
  }
  public Dimension(int width, int height) {
  }
  public double getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(double width, double height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Dimension getSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(Dimension d) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSize(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}