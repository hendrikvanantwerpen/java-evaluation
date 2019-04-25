package java.awt.image;

import java.awt.image.ImageConsumer;
import java.awt.image.ImageProducer;
import java.awt.image.ColorModel;
import java.util.Hashtable;

public class MemoryImageSource implements ImageProducer {
  public MemoryImageSource(int w,int h,ColorModel cm,byte [] pix,int off, int scan) {
  }
  public MemoryImageSource(int w,int h,ColorModel cm,byte [] pix,int off,int scan, Hashtable<?, ?> props) {
  }
  public MemoryImageSource(int w,int h,ColorModel cm,int [] pix,int off, int scan) {
  }
  public MemoryImageSource(int w,int h,ColorModel cm,int [] pix,int off,int scan, Hashtable<?, ?> props) {
  }
  public MemoryImageSource(int w,int h,int pix[],int off, int scan) {
  }
  public MemoryImageSource(int w,int h,int pix[],int off,int scan, Hashtable<?, ?> props) {
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
  public synchronized void setAnimated(boolean animated) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setFullBufferUpdates(boolean fullbuffers) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void newPixels( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void newPixels(int x,int y,int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void newPixels(int x,int y,int w,int h, boolean framenotify) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void newPixels(byte [] newpix,ColorModel newmodel,int offset, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void newPixels(int [] newpix,ColorModel newmodel,int offset, int scansize) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}