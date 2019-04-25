package java.awt.image;

import java.util.Hashtable;

public interface ImageConsumer {
  void setDimensions(int width, int height) ;
  void setProperties(Hashtable<?, ?> props) ;
  void setColorModel(ColorModel model) ;
  void setHints(int hintflags) ;
  int RANDOMPIXELORDER
  ;
  int TOPDOWNLEFTRIGHT
  ;
  int COMPLETESCANLINES
  ;
  int SINGLEPASS
  ;
  int SINGLEFRAME
  ;
  void setPixels(int x,int y,int w,int h,ColorModel model,byte pixels[],int off, int scansize) ;
  void setPixels(int x,int y,int w,int h,ColorModel model,int pixels[],int off, int scansize) ;
  void imageComplete(int status) ;
  int IMAGEERROR
  ;
  int SINGLEFRAMEDONE
  ;
  int STATICIMAGEDONE
  ;
  int IMAGEABORTED
  ;
}