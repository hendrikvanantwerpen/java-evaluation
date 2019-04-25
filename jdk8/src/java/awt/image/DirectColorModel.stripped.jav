package java.awt.image;

import java.awt.color.ColorSpace;

public class DirectColorModel extends PackedColorModel {
  public DirectColorModel(int bits,int rmask,int gmask, int bmask) {
    this(bits, rmask, gmask, bmask, 0);
  }
  public DirectColorModel(int bits,int rmask,int gmask,int bmask, int amask) {
    super(ColorSpace. getInstance(ColorSpace.CS_sRGB), bits, rmask, gmask, bmask, amask, false, amask == 0 ? Transparency.OPAQUE : Transparency.TRANSLUCENT, ColorModel. getDefaultTransferType(bits));
  }
  public DirectColorModel(ColorSpace space,int bits,int rmask,int gmask,int bmask,int amask,boolean isAlphaPremultiplied, int transferType) {
    super(space, bits, rmask, gmask, bmask, amask, isAlphaPremultiplied, amask == 0 ? Transparency.OPAQUE : Transparency.TRANSLUCENT, transferType);
  }
  final public int getRedMask( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getGreenMask( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getBlueMask( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getAlphaMask( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getRed(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getGreen(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getBlue(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getAlpha(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getRGB(int pixel) {
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
  final public int [] getComponents(int pixel,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int [] getComponents(Object pixel,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public WritableRaster createCompatibleWritableRaster(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDataElement(int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int [] components,int offset, Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public ColorModel coerceData(WritableRaster raster, boolean isAlphaPremultiplied) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompatibleRaster(Raster raster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}