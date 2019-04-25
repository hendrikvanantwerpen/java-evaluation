package java.awt.image;

import java.math.BigInteger;

public class IndexColorModel extends ColorModel {
  public IndexColorModel(int bits,int size,byte r[],byte g[], byte b[]) {
    super(bits, opaqueBits, ColorSpace. getInstance(ColorSpace.CS_sRGB), false, false, OPAQUE, ColorModel. getDefaultTransferType(bits));
  }
  public IndexColorModel(int bits,int size,byte r[],byte g[],byte b[], int trans) {
    super(bits, opaqueBits, ColorSpace. getInstance(ColorSpace.CS_sRGB), false, false, OPAQUE, ColorModel. getDefaultTransferType(bits));
  }
  public IndexColorModel(int bits,int size,byte r[],byte g[],byte b[], byte a[]) {
    super(bits, alphaBits, ColorSpace. getInstance(ColorSpace.CS_sRGB), true, false, TRANSLUCENT, ColorModel. getDefaultTransferType(bits));
  }
  public IndexColorModel(int bits,int size,byte cmap[],int start, boolean hasalpha) {
    this(bits, size, cmap, start, hasalpha, -1);
  }
  public IndexColorModel(int bits,int size,byte cmap[],int start,boolean hasalpha, int trans) {
    super(bits, opaqueBits, ColorSpace. getInstance(ColorSpace.CS_sRGB), false, false, OPAQUE, ColorModel. getDefaultTransferType(bits));
  }
  public IndexColorModel(int bits,int size,int cmap[],int start,boolean hasalpha,int trans, int transferType) {
    super(bits, opaqueBits, ColorSpace. getInstance(ColorSpace.CS_sRGB), false, false, OPAQUE, transferType);
  }
  public IndexColorModel(int bits,int size,int cmap[],int start,int transferType, BigInteger validBits) {
    super(bits, alphaBits, ColorSpace. getInstance(ColorSpace.CS_sRGB), true, false, TRANSLUCENT, transferType);
  }
  public int getTransparency( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getComponentSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getMapSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getTransparentPixel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public void getReds(byte r[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public void getGreens(byte g[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public void getBlues(byte b[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public void getAlphas(byte a[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public void getRGBs(int rgb[]) {
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
  public synchronized Object getDataElements(int rgb, Object pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getComponents(int pixel,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getComponents(Object pixel,int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDataElement(int [] components, int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int [] components,int offset, Object pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public WritableRaster createCompatibleWritableRaster(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompatibleRaster(Raster raster) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createCompatibleSampleModel(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompatibleSampleModel(SampleModel sm) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BufferedImage convertToIntDiscrete(Raster raster, boolean forceARGB) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValid(int pixel) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isValid( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BigInteger getValidPixels( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finalize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}