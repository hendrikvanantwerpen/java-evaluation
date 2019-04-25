package java.awt.image;

import java.util.Hashtable;

public class ImageFilter implements ImageConsumer, Cloneable {
  public ImageFilter getFilterInstance(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDimensions(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setProperties(Hashtable<?, ?> props) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColorModel(ColorModel model) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHints(int hints) {
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
  public void resendTopDownLeftRight(ImageProducer ip) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}