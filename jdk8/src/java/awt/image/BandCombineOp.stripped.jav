package java.awt.image;

import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.RenderingHints;

public class BandCombineOp implements RasterOp {
  public BandCombineOp(float [] [] matrix, RenderingHints hints) {
  }
  public final float [] [] getMatrix( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster filter(Raster src, WritableRaster dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Rectangle2D getBounds2D(Raster src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleDestRaster(Raster src) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final RenderingHints getRenderingHints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}