package java.awt.image;

import java.awt.image.ImageFilter;

public class BufferedImageFilter extends ImageFilter implements Cloneable {
  public BufferedImageFilter(BufferedImageOp op) {
    super( );
  }
  public BufferedImageOp getBufferedImageOp( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDimensions(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColorModel(ColorModel model) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,ColorModel model,byte pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,ColorModel model,int pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void imageComplete(int status) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}