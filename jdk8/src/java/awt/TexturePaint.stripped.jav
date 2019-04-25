package java.awt;

import java.awt.geom.Rectangle2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class TexturePaint implements Paint {
  public TexturePaint(BufferedImage txtr, Rectangle2D anchor) {
  }
  public BufferedImage getImage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Rectangle2D getAnchorRect( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PaintContext createContext(ColorModel cm,Rectangle deviceBounds,Rectangle2D userBounds,AffineTransform xform, RenderingHints hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}