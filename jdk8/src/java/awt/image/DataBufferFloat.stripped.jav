package java.awt.image;


public final class DataBufferFloat extends DataBuffer {
  public DataBufferFloat(int size) {
    super(STABLE, TYPE_FLOAT, size);
  }
  public DataBufferFloat(int size, int numBanks) {
    super(STABLE, TYPE_FLOAT, size, numBanks);
  }
  public DataBufferFloat(float dataArray[], int size) {
    super(UNTRACKABLE, TYPE_FLOAT, size);
  }
  public DataBufferFloat(float dataArray[],int size, int offset) {
    super(UNTRACKABLE, TYPE_FLOAT, size, 1, offset);
  }
  public DataBufferFloat(float dataArray[] [], int size) {
    super(UNTRACKABLE, TYPE_FLOAT, size, dataArray.length);
  }
  public DataBufferFloat(float dataArray[] [],int size, int offsets[]) {
    super(UNTRACKABLE, TYPE_FLOAT, size, dataArray.length, offsets);
  }
  public float [] getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] getData(int bank) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float [] [] getBankData( ) {
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