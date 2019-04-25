package java.awt.image;

import java.awt.image.ImageFilter;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

public class FilteredImageSource implements ImageProducer {
  public FilteredImageSource(ImageProducer orig, ImageFilter imgf) {
  }
  public synchronized void addConsumer(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean isConsumer(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void removeConsumer(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void startProduction(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void requestTopDownLeftRightResend(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}