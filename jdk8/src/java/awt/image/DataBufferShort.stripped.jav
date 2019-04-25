package java.awt.image;


public final class DataBufferShort extends DataBuffer {
  public DataBufferShort(int size) {
    super(STABLE, TYPE_SHORT, size);
  }
  public DataBufferShort(int size, int numBanks) {
    super(STABLE, TYPE_SHORT, size, numBanks);
  }
  public DataBufferShort(short dataArray[], int size) {
    super(UNTRACKABLE, TYPE_SHORT, size);
  }
  public DataBufferShort(short dataArray[],int size, int offset) {
    super(UNTRACKABLE, TYPE_SHORT, size, 1, offset);
  }
  public DataBufferShort(short dataArray[] [], int size) {
    super(UNTRACKABLE, TYPE_SHORT, size, dataArray.length);
  }
  public DataBufferShort(short dataArray[] [],int size, int offsets[]) {
    super(UNTRACKABLE, TYPE_SHORT, size, dataArray.length, offsets);
  }
  public short [] getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short [] getData(int bank) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short [] [] getBankData( ) {
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
}