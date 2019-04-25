package java.awt.font;

import java.awt.geom.AffineTransform;

public class FontRenderContext {
  protected FontRenderContext( ) {
  }
  public FontRenderContext(AffineTransform tx,boolean isAntiAliased, boolean usesFractionalMetrics) {
  }
  public FontRenderContext(AffineTransform tx,Object aaHint, Object fmHint) {
  }
  public boolean isTransformed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransformType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AffineTransform getTransform( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAntiAliased( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean usesFractionalMetrics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getAntiAliasingHint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getFractionalMetricsHint( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(FontRenderContext rhs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}