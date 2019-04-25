package java.text;


public final class Bidi {
  public static final int DIRECTION_LEFT_TO_RIGHT;
  public static final int DIRECTION_RIGHT_TO_LEFT;
  public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT;
  public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT;
  public Bidi(String paragraph, int flags) {
  }
  public Bidi(AttributedCharacterIterator paragraph) {
  }
  public Bidi(char [] text,int textStart,byte [] embeddings,int embStart,int paragraphLength, int flags) {
  }
  public Bidi createLineBidi(int lineStart, int lineLimit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMixed( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLeftToRight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isRightToLeft( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean baseIsLeftToRight( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBaseLevel( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getLevelAt(int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRunCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRunLevel(int run) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRunStart(int run) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getRunLimit(int run) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean requiresBidi(char [] text,int start, int limit) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void reorderVisually(byte [] levels,int levelStart,Object [] objects,int objectStart, int count) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}