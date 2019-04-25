package java.awt;

import java.awt.image.ImageProducer;
import java.awt.image.ImageObserver;

public abstract class Image {
  public abstract int getWidth(ImageObserver observer) ;
  public abstract int getHeight(ImageObserver observer) ;
  public abstract ImageProducer getSource( ) ;
  public abstract Graphics getGraphics( ) ;
  public abstract Object getProperty(String name, ImageObserver observer) ;
  public static final Object UndefinedProperty;
  public Image getScaledInstance(int width,int height, int hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int SCALE_DEFAULT;
  public static final int SCALE_FAST;
  public static final int SCALE_SMOOTH;
  public static final int SCALE_REPLICATE;
  public static final int SCALE_AREA_AVERAGING;
  public void flush( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ImageCapabilities getCapabilities(GraphicsConfiguration gc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAccelerationPriority(float priority) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getAccelerationPriority( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}