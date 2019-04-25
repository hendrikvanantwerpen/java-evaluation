package java.awt.image;

import java.awt.Rectangle;
import java.awt.Point;

public class WritableRaster extends Raster {
  protected WritableRaster(SampleModel sampleModel, Point origin) {
    this(sampleModel, sampleModel. createDataBuffer( ), new Rectangle (origin.x,origin.y,sampleModel. getWidth( ),sampleModel. getHeight( )), origin, null);
  }
  protected WritableRaster(SampleModel sampleModel,DataBuffer dataBuffer, Point origin) {
    this(sampleModel, dataBuffer, new Rectangle (origin.x,origin.y,sampleModel. getWidth( ),sampleModel. getHeight( )), origin, null);
  }
  protected WritableRaster(SampleModel sampleModel,DataBuffer dataBuffer,Rectangle aRegion,Point sampleModelTranslate, WritableRaster parent) {
    super(sampleModel, dataBuffer, aRegion, sampleModelTranslate, parent);
  }
  public WritableRaster getWritableParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createWritableTranslatedChild(int childMinX, int childMinY) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createWritableChild(int parentX,int parentY,int w,int h,int childMinX,int childMinY, int bandList[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDataElements(int x,int y, Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDataElements(int x,int y, Raster inRaster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDataElements(int x,int y,int w,int h, Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRect(Raster srcRaster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setRect(int dx,int dy, Raster srcRaster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y, int iArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y, float fArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y, double dArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h, int iArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h, float fArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h, double dArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b, int s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b, float s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b, double s) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b, int iArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b, float fArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b, double dArray[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}