package java.awt.image;


public class ShortLookupTable extends LookupTable {
  public ShortLookupTable(int offset, short data[] []) {
    super(offset, data.length);
  }
  public ShortLookupTable(int offset, short data[]) {
    super(offset, data.length);
  }
  public final short [] [] getTable( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int [] lookupPixel(int [] src, int [] dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short [] lookupPixel(short [] src, short [] dst) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}