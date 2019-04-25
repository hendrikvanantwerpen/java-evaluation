package java.awt.image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.Transparency;

public abstract class VolatileImage extends Image implements Transparency {
  public static final int IMAGE_OK;
  public static final int IMAGE_RESTORED;
  public static final int IMAGE_INCOMPATIBLE;
  public abstract BufferedImage getSnapshot( ) ;
  public abstract int getWidth( ) ;
  public abstract int getHeight( ) ;
  public ImageProducer getSource( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Graphics getGraphics( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Graphics2D createGraphics( ) ;
  public abstract int validate(GraphicsConfiguration gc) ;
  public abstract boolean contentsLost( ) ;
  public abstract ImageCapabilities getCapabilities( ) ;
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}