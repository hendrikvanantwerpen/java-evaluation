package java.awt;

import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.VolatileImage;

public abstract class GraphicsConfiguration {
  protected GraphicsConfiguration( ) {
  }
  public abstract GraphicsDevice getDevice( ) ;
  public BufferedImage createCompatibleImage(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferedImage createCompatibleImage(int width,int height, int transparency) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VolatileImage createCompatibleVolatileImage(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VolatileImage createCompatibleVolatileImage(int width,int height, int transparency) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VolatileImage createCompatibleVolatileImage(int width,int height, ImageCapabilities caps) throws AWTException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public VolatileImage createCompatibleVolatileImage(int width,int height,ImageCapabilities caps, int transparency) throws AWTException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract ColorModel getColorModel( ) ;
  public abstract ColorModel getColorModel(int transparency) ;
  public abstract AffineTransform getDefaultTransform( ) ;
  public abstract AffineTransform getNormalizingTransform( ) ;
  public abstract Rectangle getBounds( ) ;
  public BufferCapabilities getBufferCapabilities( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ImageCapabilities getImageCapabilities( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isTranslucencyCapable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}