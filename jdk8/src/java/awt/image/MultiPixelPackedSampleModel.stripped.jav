package java.awt.image;


public class MultiPixelPackedSampleModel extends SampleModel {
  public MultiPixelPackedSampleModel(int dataType,int w,int h, int numberOfBits) {
    this(dataType, w, h, numberOfBits, (w * numberOfBits + DataBuffer. getDataTypeSize(dataType) - 1) / DataBuffer. getDataTypeSize(dataType), 0);
  }
  public MultiPixelPackedSampleModel(int dataType,int w,int h,int numberOfBits,int scanlineStride, int dataBitOffset) {
    super(dataType, w, h, 1);
  }
  public SampleModel createCompatibleSampleModel(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DataBuffer createDataBuffer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumDataElements( ) {
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
  public int getBitOffset(int x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getScanlineStride( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getPixelBitStride( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getDataBitOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransferType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createSubsetSampleModel(int bands[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getSample(int x,int y,int b, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b,int s, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getDataElements(int x,int y,Object obj, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixel(int x,int y,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDataElements(int x,int y,Object obj, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y,int [] iArray, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}