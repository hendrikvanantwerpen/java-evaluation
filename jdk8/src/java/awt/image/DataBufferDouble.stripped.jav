package java.awt.image;


public final class DataBufferDouble extends DataBuffer {
  public DataBufferDouble(int size) {
    super(STABLE, TYPE_DOUBLE, size);
  }
  public DataBufferDouble(int size, int numBanks) {
    super(STABLE, TYPE_DOUBLE, size, numBanks);
  }
  public DataBufferDouble(double dataArray[], int size) {
    super(UNTRACKABLE, TYPE_DOUBLE, size);
  }
  public DataBufferDouble(double dataArray[],int size, int offset) {
    super(UNTRACKABLE, TYPE_DOUBLE, size, 1, offset);
  }
  public DataBufferDouble(double dataArray[] [], int size) {
    super(UNTRACKABLE, TYPE_DOUBLE, size, dataArray.length);
  }
  public DataBufferDouble(double dataArray[] [],int size, int offsets[]) {
    super(UNTRACKABLE, TYPE_DOUBLE, size, dataArray.length, offsets);
  }
  public double [] getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] getData(int bank) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double [] [] getBankData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getElem(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getElem(int bank, int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElem(int i, int val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElem(int bank,int i, int val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getElemFloat(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getElemFloat(int bank, int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemFloat(int i, float val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemFloat(int bank,int i, float val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getElemDouble(int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getElemDouble(int bank, int i) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemDouble(int i, double val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setElemDouble(int bank,int i, double val) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}