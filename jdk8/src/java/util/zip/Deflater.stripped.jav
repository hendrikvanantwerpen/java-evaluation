package java.util.zip;


public class Deflater {
  public static final int DEFLATED;
  public static final int NO_COMPRESSION;
  public static final int BEST_SPEED;
  public static final int BEST_COMPRESSION;
  public static final int DEFAULT_COMPRESSION;
  public static final int FILTERED;
  public static final int HUFFMAN_ONLY;
  public static final int DEFAULT_STRATEGY;
  public static final int NO_FLUSH;
  public static final int SYNC_FLUSH;
  public static final int FULL_FLUSH;
  public Deflater(int level, boolean nowrap) {
  }
  public Deflater(int level) {
    this(level, false);
  }
  public Deflater( ) {
    this(DEFAULT_COMPRESSION, false);
  }
  public void setInput(byte [] b,int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setInput(byte [] b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDictionary(byte [] b,int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setDictionary(byte [] b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setStrategy(int strategy) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setLevel(int level) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean needsInput( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void finish( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean finished( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int deflate(byte [] b,int off, int len) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int deflate(byte [] b) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int deflate(byte [] b,int off,int len, int flush) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getAdler( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTotalIn( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getBytesRead( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getTotalOut( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getBytesWritten( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void reset( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void end( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}