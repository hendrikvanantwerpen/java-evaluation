package java.awt.font;

import java.awt.Image;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public final class ImageGraphicAttribute extends GraphicAttribute {
  public ImageGraphicAttribute(Image image, int alignment) {
    this(image, alignment, 0, 0);
  }
  public ImageGraphicAttribute(Image image,int alignment,float originX, float originY) {
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
  public Rectangle2D getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void draw(Graphics2D graphics,float x, float y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(ImageGraphicAttribute rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}