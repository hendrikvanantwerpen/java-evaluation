package java.util.zip;


public class Inflater {
  public Inflater(boolean nowrap) {
  }
  public Inflater( ) {
    this(false);
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
  public int getRemaining( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean needsInput( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean needsDictionary( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean finished( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int inflate(byte [] b,int off, int len) throws DataFormatException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int inflate(byte [] b) throws DataFormatException {
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