package java.awt.image;

import java.awt.geom.Rectangle2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;

public class ConvolveOp implements BufferedImageOp, RasterOp {
  public static final int EDGE_ZERO_FILL;
  public static final int EDGE_NO_OP;
  public ConvolveOp(Kernel kernel,int edgeCondition, RenderingHints hints) {
  }
  public ConvolveOp(Kernel kernel) {
  }
  public int getEdgeCondition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Kernel getKernel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final BufferedImage filter(BufferedImage src, BufferedImage dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final WritableRaster filter(Raster src, WritableRaster dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleDestRaster(Raster src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Rectangle2D getBounds2D(BufferedImage src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Rectangle2D getBounds2D(Raster src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final RenderingHints getRenderingHints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}