package java.awt.image;

import java.awt.Transparency;
import java.awt.color.ColorSpace;

public abstract class ColorModel implements Transparency {
  public static ColorModel getRGBdefault( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ColorModel(int bits) {
  }
  protected ColorModel(int pixel_bits,int [] bits,ColorSpace cspace,boolean hasAlpha,boolean isAlphaPremultiplied,int transparency, int transferType) {
  }
  final public boolean hasAlpha( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public boolean isAlphaPremultiplied( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getTransferType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPixelSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getComponentSize(int componentIdx) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getComponentSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumComponents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumColorComponents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int getRed(int pixel) ;
  public abstract int getGreen(int pixel) ;
  public abstract int getBlue(int pixel) ;
  public abstract int getAlpha(int pixel) ;
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
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public ColorSpace getColorSpace( ) {
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
  public void finalize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster getAlphaRaster(WritableRaster raster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}