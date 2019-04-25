package java.awt.image;


public final class DataBufferInt extends DataBuffer {
  public DataBufferInt(int size) {
    super(STABLE, TYPE_INT, size);
  }
  public DataBufferInt(int size, int numBanks) {
    super(STABLE, TYPE_INT, size, numBanks);
  }
  public DataBufferInt(int dataArray[], int size) {
    super(UNTRACKABLE, TYPE_INT, size);
  }
  public DataBufferInt(int dataArray[],int size, int offset) {
    super(UNTRACKABLE, TYPE_INT, size, 1, offset);
  }
  public DataBufferInt(int dataArray[] [], int size) {
    super(UNTRACKABLE, TYPE_INT, size, dataArray.length);
  }
  public DataBufferInt(int dataArray[] [],int size, int offsets[]) {
    super(UNTRACKABLE, TYPE_INT, size, dataArray.length, offsets);
  }
  public int [] getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] getData(int bank) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] [] getBankData( ) {
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