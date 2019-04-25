package java.awt.font;

import java.awt.Shape;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public final class ShapeGraphicAttribute extends GraphicAttribute {
  public static final boolean STROKE;
  public static final boolean FILL;
  public ShapeGraphicAttribute(Shape shape,int alignment, boolean stroke) {
    super(alignment);
  }
  public float getAscent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getDescent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAdvance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void draw(Graphics2D graphics,float x, float y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getOutline(AffineTransform tx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(ShapeGraphicAttribute rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}