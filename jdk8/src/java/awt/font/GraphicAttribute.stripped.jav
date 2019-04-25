package java.awt.font;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public abstract class GraphicAttribute {
  public static final int TOP_ALIGNMENT;
  public static final int BOTTOM_ALIGNMENT;
  public static final int ROMAN_BASELINE;
  public static final int CENTER_BASELINE;
  public static final int HANGING_BASELINE;
  protected GraphicAttribute(int alignment) {
  }
  public abstract float getAscent( ) ;
  public abstract float getDescent( ) ;
  public abstract float getAdvance( ) ;
  public Rectangle2D getBounds( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Shape getOutline(AffineTransform tx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void draw(Graphics2D graphics,float x, float y) ;
  public final int getAlignment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public GlyphJustificationInfo getJustificationInfo( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}