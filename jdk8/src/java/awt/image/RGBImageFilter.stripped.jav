package java.awt.image;

import java.awt.image.ColorModel;

public abstract class RGBImageFilter extends ImageFilter {
  public void setColorModel(ColorModel model) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void substituteColorModel(ColorModel oldcm, ColorModel newcm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public IndexColorModel filterIndexColorModel(IndexColorModel icm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void filterRGBPixels(int x,int y,int w,int h,int pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,ColorModel model,byte pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,ColorModel model,int pixels[],int off, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int filterRGB(int x,int y, int rgb) ;
}