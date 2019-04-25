package java.awt.image;

import java.awt.color.ColorSpace;

public abstract class PackedColorModel extends ColorModel {
  public PackedColorModel(ColorSpace space,int bits,int [] colorMaskArray,int alphaMask,boolean isAlphaPremultiplied,int trans, int transferType) {
    super(bits, PackedColorModel. createBitsArray(colorMaskArray, alphaMask), space, alphaMask == 0 ? false : true, isAlphaPremultiplied, trans, transferType);
  }
  public PackedColorModel(ColorSpace space,int bits,int rmask,int gmask,int bmask,int amask,boolean isAlphaPremultiplied,int trans, int transferType) {
    super(bits, PackedColorModel. createBitsArray(rmask, gmask, bmask, amask), space, amask == 0 ? false : true, isAlphaPremultiplied, trans, transferType);
  }
  final public int getMask(int index) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int [] getMasks( ) {
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