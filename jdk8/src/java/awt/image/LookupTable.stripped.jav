package java.awt.image;


public abstract class LookupTable extends Object {
  protected LookupTable(int offset, int numComponents) {
  }
  public int getNumComponents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getOffset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int [] lookupPixel(int [] src, int [] dest) ;
}