package java.awt.image.renderable;

import java.awt.image.RenderedImage;
import java.awt.RenderingHints;
import java.util.Vector;

public class RenderableImageOp implements RenderableImage {
  public RenderableImageOp(ContextualRenderedImageFactory CRIF, ParameterBlock paramBlock) {
  }
  public Vector<RenderableImage> getSources( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getProperty(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] getPropertyNames( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDynamic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMinX( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getMinY( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ParameterBlock setParameterBlock(ParameterBlock paramBlock) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ParameterBlock getParameterBlock( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public RenderedImage createScaledRendering(int w,int h, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public RenderedImage createDefaultRendering( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public RenderedImage createRendering(RenderContext renderContext) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}