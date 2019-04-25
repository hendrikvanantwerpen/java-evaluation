package java.nio;


public abstract class Buffer {
  Buffer(int mark,int pos,int lim, int cap) {
  }
  public final int capacity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int position( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer position(int newPosition) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int limit( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer limit(int newLimit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer mark( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer flip( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Buffer rewind( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int remaining( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final boolean hasRemaining( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract boolean isReadOnly( ) ;
  public abstract boolean hasArray( ) ;
  public abstract Object array( ) ;
  public abstract int arrayOffset( ) ;
  public abstract boolean isDirect( ) ;
}