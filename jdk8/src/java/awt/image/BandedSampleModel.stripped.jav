package java.awt.image;


public final class BandedSampleModel extends ComponentSampleModel {
  public BandedSampleModel(int dataType,int w,int h, int numBands) {
    super(dataType, w, h, 1, w, BandedSampleModel. createIndicesArray(numBands), BandedSampleModel. createOffsetArray(numBands));
  }
  public BandedSampleModel(int dataType,int w,int h,int scanlineStride,int bankIndices[], int bandOffsets[]) {
    super(dataType, w, h, 1, scanlineStride, bankIndices, bandOffsets);
  }
  public SampleModel createCompatibleSampleModel(int w, int h) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public SampleModel createSubsetSampleModel(int bands[]) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public DataBuffer createDataBuffer( ) {
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
  public float getSampleFloat(int x,int y,int b, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getSampleDouble(int x,int y,int b, DataBuffer data) {
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
  public void setSample(int x,int y,int b,float s, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b,double s, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}