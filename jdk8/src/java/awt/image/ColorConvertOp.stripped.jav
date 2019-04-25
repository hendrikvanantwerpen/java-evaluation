package java.awt.image;

import java.awt.color.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.RenderingHints;

public class ColorConvertOp implements BufferedImageOp, RasterOp {
  public ColorConvertOp(RenderingHints hints) {
  }
  public ColorConvertOp(ColorSpace cspace, RenderingHints hints) {
  }
  public ColorConvertOp(ColorSpace srcCspace,ColorSpace dstCspace, RenderingHints hints) {
  }
  public ColorConvertOp(ICC_Profile [] profiles, RenderingHints hints) {
  }
  public final ICC_Profile [] getICC_Profiles( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final BufferedImage filter(BufferedImage src, BufferedImage dest) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final WritableRaster filter(Raster src, WritableRaster dest) {
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
  public final RenderingHints getRenderingHints( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}