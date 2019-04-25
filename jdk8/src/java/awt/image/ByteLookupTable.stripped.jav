package java.awt.image;


public class ByteLookupTable extends LookupTable {
  public ByteLookupTable(int offset, byte data[] []) {
    super(offset, data.length);
  }
  public ByteLookupTable(int offset, byte data[]) {
    super(offset, data.length);
  }
  public final byte [] [] getTable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] lookupPixel(int [] src, int [] dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] lookupPixel(byte [] src, byte [] dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}