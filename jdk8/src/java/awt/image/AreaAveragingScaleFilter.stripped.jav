package java.awt.image;

import java.awt.image.ColorModel;

public class AreaAveragingScaleFilter extends ReplicateScaleFilter {
  public AreaAveragingScaleFilter(int width, int height) {
    super(width, height);
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
}