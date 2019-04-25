package java.awt.image;

import java.awt.color.ColorSpace;

public class ComponentColorModel extends ColorModel {
  public ComponentColorModel(ColorSpace colorSpace,int [] bits,boolean hasAlpha,boolean isAlphaPremultiplied,int transparency, int transferType) {
    super(bitsHelper(transferType, colorSpace, hasAlpha), bitsArrayHelper(bits, transferType, colorSpace, hasAlpha), colorSpace, hasAlpha, isAlphaPremultiplied, transparency, transferType);
  }
  public ComponentColorModel(ColorSpace colorSpace,boolean hasAlpha,boolean isAlphaPremultiplied,int transparency, int transferType) {
    this(colorSpace, null, hasAlpha, isAlphaPremultiplied, transparency, transferType);
  }
  public int getRed(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getGreen(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBlue(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAlpha(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRGB(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRed(Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getGreen(Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBlue(Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAlpha(Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRGB(Object inData) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int rgb, Object pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getComponents(int pixel,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getComponents(Object pixel,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getUnnormalizedComponents(float [] normComponents,int normOffset,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getNormalizedComponents(int [] components,int offset,float [] normComponents, int normOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDataElement(int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int [] components,int offset, Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDataElement(float [] normComponents, int normOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(float [] normComponents,int normOffset, Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getNormalizedComponents(Object pixel,float [] normComponents, int normOffset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ColorModel coerceData(WritableRaster raster, boolean isAlphaPremultiplied) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompatibleRaster(Raster raster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleWritableRaster(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createCompatibleSampleModel(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompatibleSampleModel(SampleModel sm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster getAlphaRaster(WritableRaster raster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}