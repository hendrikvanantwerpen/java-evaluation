package java.awt.image.renderable;

import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;

public class RenderableImageProducer implements ImageProducer, Runnable {
  public RenderableImageProducer(RenderableImage rdblImage, RenderContext rc) {
  }
  public synchronized void setRenderContext(RenderContext rc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
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
  public synchronized void startProduction(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void requestTopDownLeftRightResend(ImageConsumer ic) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void run( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}