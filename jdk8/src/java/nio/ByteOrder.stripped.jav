package java.nio;


public final class ByteOrder {
  private ByteOrder(String name) {
  }
  public static final ByteOrder BIG_ENDIAN;
  public static final ByteOrder LITTLE_ENDIAN;
  public static ByteOrder nativeOrder( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}