package java.util;


public final class Spliterators {
  private Spliterators( ) {
  }
  public static <T> Spliterator<T> emptySpliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfInt emptyIntSpliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfLong emptyLongSpliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfDouble emptyDoubleSpliterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Spliterator<T> spliterator(Object [] array, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Spliterator<T> spliterator(Object [] array,int fromIndex,int toIndex, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfInt spliterator(int [] array, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfInt spliterator(int [] array,int fromIndex,int toIndex, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfLong spliterator(long [] array, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfLong spliterator(long [] array,int fromIndex,int toIndex, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfDouble spliterator(double [] array, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfDouble spliterator(double [] array,int fromIndex,int toIndex, int additionalCharacteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Spliterator<T> spliterator(Collection<? extends T> c, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Spliterator<T> spliterator(Iterator<? extends T> iterator,long size, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Spliterator<T> spliteratorUnknownSize(Iterator<? extends T> iterator, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfInt spliterator(PrimitiveIterator. OfInt iterator,long size, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfInt spliteratorUnknownSize(PrimitiveIterator. OfInt iterator, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfLong spliterator(PrimitiveIterator. OfLong iterator,long size, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfLong spliteratorUnknownSize(PrimitiveIterator. OfLong iterator, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfDouble spliterator(PrimitiveIterator. OfDouble iterator,long size, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Spliterator. OfDouble spliteratorUnknownSize(PrimitiveIterator. OfDouble iterator, int characteristics) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> Iterator<T> iterator(Spliterator<? extends T> spliterator) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PrimitiveIterator. OfInt iterator(Spliterator. OfInt spliterator) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PrimitiveIterator. OfLong iterator(Spliterator. OfLong spliterator) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static PrimitiveIterator. OfDouble iterator(Spliterator. OfDouble spliterator) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static abstract class AbstractSpliterator<T> implements Spliterator<T> {
    protected AbstractSpliterator(long est, int additionalCharacteristics) {
    }
    public Spliterator<T> trySplit( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public long estimateSize( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int characteristics( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static abstract class AbstractIntSpliterator implements Spliterator. OfInt {
    protected AbstractIntSpliterator(long est, int additionalCharacteristics) {
    }
    public Spliterator. OfInt trySplit( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public long estimateSize( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int characteristics( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static abstract class AbstractLongSpliterator implements Spliterator. OfLong {
    protected AbstractLongSpliterator(long est, int additionalCharacteristics) {
    }
    public Spliterator. OfLong trySplit( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public long estimateSize( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int characteristics( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static abstract class AbstractDoubleSpliterator implements Spliterator. OfDouble {
    protected AbstractDoubleSpliterator(long est, int additionalCharacteristics) {
    }
    public Spliterator. OfDouble trySplit( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public long estimateSize( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int characteristics( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}