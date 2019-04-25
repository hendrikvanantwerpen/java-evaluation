package java.awt.image;

import java.util.Hashtable;
import java.awt.image.ImageProducer;
import java.awt.image.ImageConsumer;
import java.awt.image.ColorModel;
import java.awt.Image;

public class PixelGrabber implements ImageConsumer {
  public PixelGrabber(Image img,int x,int y,int w,int h,int [] pix,int off, int scansize) {
    this(img. getSource( ), x, y, w, h, pix, off, scansize);
  }
  public PixelGrabber(ImageProducer ip,int x,int y,int w,int h,int [] pix,int off, int scansize) {
  }
  public PixelGrabber(Image img,int x,int y,int w,int h, boolean forceRGB) {
  }
  public synchronized void startGrabbing( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void abortGrabbing( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean grabPixels( ) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean grabPixels(long ms) throws InterruptedException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getStatus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Object getPixels( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized ColorModel getColorModel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDimensions(int width, int height) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setHints(int hints) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setProperties(Hashtable<?, ?> props) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setColorModel(ColorModel model) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int srcX,int srcY,int srcW,int srcH,ColorModel model,byte pixels[],int srcOff, int srcScan) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int srcX,int srcY,int srcW,int srcH,ColorModel model,int pixels[],int srcOff, int srcScan) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void imageComplete(int status) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int status( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}