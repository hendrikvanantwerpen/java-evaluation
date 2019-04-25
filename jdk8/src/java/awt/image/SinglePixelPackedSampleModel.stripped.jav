package java.awt.image;


public class SinglePixelPackedSampleModel extends SampleModel {
  public SinglePixelPackedSampleModel(int dataType,int w,int h, int bitMasks[]) {
    this(dataType, w, h, w, bitMasks);
  }
  public SinglePixelPackedSampleModel(int dataType,int w,int h,int scanlineStride, int bitMasks[]) {
    super(dataType, w, h, bitMasks.length);
  }
  public int getNumDataElements( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createCompatibleSampleModel(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DataBuffer createDataBuffer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getSampleSize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSampleSize(int band) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOffset(int x, int y) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getBitOffsets( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getBitMasks( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getScanlineStride( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createSubsetSampleModel(int bands[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int x,int y,Object obj, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixel(int x,int y,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixels(int x,int y,int w,int h,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSample(int x,int y,int b, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getSamples(int x,int y,int w,int h,int b,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDataElements(int x,int y,Object obj, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b,int s, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}