package java.awt.image;

import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.RenderingHints;

public class AffineTransformOp implements BufferedImageOp, RasterOp {
  public static final int TYPE_NEAREST_NEIGHBOR;
  public static final int TYPE_BILINEAR;
  public static final int TYPE_BICUBIC;
  public AffineTransformOp(AffineTransform xform, RenderingHints hints) {
  }
  public AffineTransformOp(AffineTransform xform, int interpolationType) {
  }
  public final int getInterpolationType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final BufferedImage filter(BufferedImage src, BufferedImage dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final WritableRaster filter(Raster src, WritableRaster dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Rectangle2D getBounds2D(BufferedImage src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Rectangle2D getBounds2D(Raster src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleDestRaster(Raster src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final AffineTransform getTransform( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final RenderingHints getRenderingHints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}