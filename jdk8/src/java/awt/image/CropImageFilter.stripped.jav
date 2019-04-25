package java.awt.image;

import java.awt.image.ColorModel;
import java.util.Hashtable;

public class CropImageFilter extends ImageFilter {
  public CropImageFilter(int x,int y,int w, int h) {
  }
  public void setProperties(Hashtable<?, ?> props) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDimensions(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,ColorModel model,byte pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,ColorModel model,int pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}