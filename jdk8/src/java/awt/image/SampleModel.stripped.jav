package java.awt.image;


public abstract class SampleModel {
  public SampleModel(int dataType,int w,int h, int numBands) {
  }
  final public int getWidth( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getHeight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  final public int getNumBands( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int getNumDataElements( ) ;
  final public int getDataType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTransferType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixel(int x,int y,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Object getDataElements(int x,int y,Object obj, DataBuffer data) ;
  public Object getDataElements(int x,int y,int w,int h,Object obj, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setDataElements(int x,int y,Object obj, DataBuffer data) ;
  public void setDataElements(int x,int y,int w,int h,Object obj, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getPixel(int x,int y,float fArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getPixel(int x,int y,double dArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getPixels(int x,int y,int w,int h,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getPixels(int x,int y,int w,int h,float fArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getPixels(int x,int y,int w,int h,double dArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int getSample(int x,int y,int b, DataBuffer data) ;
  public float getSampleFloat(int x,int y,int b, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getSampleDouble(int x,int y,int b, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getSamples(int x,int y,int w,int h,int b,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getSamples(int x,int y,int w,int h,int b,float fArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getSamples(int x,int y,int w,int h,int b,double dArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y,float fArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixel(int x,int y,double dArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,float fArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPixels(int x,int y,int w,int h,double dArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setSample(int x,int y,int b,int s, DataBuffer data) ;
  public void setSample(int x,int y,int b,float s, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSample(int x,int y,int b,double s, DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b,int iArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b,float fArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setSamples(int x,int y,int w,int h,int b,double dArray[], DataBuffer data) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract SampleModel createCompatibleSampleModel(int w, int h) ;
  public abstract SampleModel createSubsetSampleModel(int bands[]) ;
  public abstract DataBuffer createDataBuffer( ) ;
  public abstract int [] getSampleSize( ) ;
  public abstract int getSampleSize(int band) ;
}