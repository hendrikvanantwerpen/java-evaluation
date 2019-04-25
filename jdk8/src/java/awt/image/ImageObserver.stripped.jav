package java.awt.image;

import java.awt.Image;

public interface ImageObserver {
  public boolean imageUpdate(Image img,int infoflags,int x,int y,int width, int height) ;
  public static final int WIDTH
  ;
  public static final int HEIGHT
  ;
  public static final int PROPERTIES
  ;
  public static final int SOMEBITS
  ;
  public static final int FRAMEBITS
  ;
  public static final int ALLBITS
  ;
  public static final int ERROR
  ;
  public static final int ABORT
  ;
}