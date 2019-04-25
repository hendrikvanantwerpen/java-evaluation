package java.awt.image;


public final class DataBufferUShort extends DataBuffer {
  public DataBufferUShort(int size) {
    super(STABLE, TYPE_USHORT, size);
  }
  public DataBufferUShort(int size, int numBanks) {
    super(STABLE, TYPE_USHORT, size, numBanks);
  }
  public DataBufferUShort(short dataArray[], int size) {
    super(UNTRACKABLE, TYPE_USHORT, size);
  }
  public DataBufferUShort(short dataArray[],int size, int offset) {
    super(UNTRACKABLE, TYPE_USHORT, size, 1, offset);
  }
  public DataBufferUShort(short dataArray[] [], int size) {
    super(UNTRACKABLE, TYPE_USHORT, size, dataArray.length);
  }
  public DataBufferUShort(short dataArray[] [],int size, int offsets[]) {
    super(UNTRACKABLE, TYPE_USHORT, size, dataArray.length, offsets);
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