package java.awt.font;

import java.awt.geom.Rectangle2D;

public final class GlyphMetrics {
  public static final byte STANDARD;
  public static final byte LIGATURE;
  public static final byte COMBINING;
  public static final byte COMPONENT;
  public static final byte WHITESPACE;
  public GlyphMetrics(float advance,Rectangle2D bounds, byte glyphType) {
  }
  public GlyphMetrics(boolean horizontal,float advanceX,float advanceY,Rectangle2D bounds, byte glyphType) {
  }
  public float getAdvance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAdvanceX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAdvanceY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getBounds2D( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getLSB( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getRSB( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isStandard( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLigature( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCombining( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isComponent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isWhitespace( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}