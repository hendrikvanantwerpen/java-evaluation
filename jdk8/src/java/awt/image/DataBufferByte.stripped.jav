package java.awt.image;


public final class DataBufferByte extends DataBuffer {
  public DataBufferByte(int size) {
    super(STABLE, TYPE_BYTE, size);
  }
  public DataBufferByte(int size, int numBanks) {
    super(STABLE, TYPE_BYTE, size, numBanks);
  }
  public DataBufferByte(byte dataArray[], int size) {
    super(UNTRACKABLE, TYPE_BYTE, size);
  }
  public DataBufferByte(byte dataArray[],int size, int offset) {
    super(UNTRACKABLE, TYPE_BYTE, size, 1, offset);
  }
  public DataBufferByte(byte dataArray[] [], int size) {
    super(UNTRACKABLE, TYPE_BYTE, size, dataArray.length);
  }
  public DataBufferByte(byte dataArray[] [],int size, int offsets[]) {
    super(UNTRACKABLE, TYPE_BYTE, size, dataArray.length, offsets);
  }
  public byte [] getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getData(int bank) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] [] getBankData( ) {
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