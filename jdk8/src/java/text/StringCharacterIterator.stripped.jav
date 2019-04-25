package java.text;


public final class StringCharacterIterator implements CharacterIterator {
  public StringCharacterIterator(String text) {
    this(text, 0);
  }
  public StringCharacterIterator(String text, int pos) {
    this(text, 0, text. length( ), pos);
  }
  public StringCharacterIterator(String text,int begin,int end, int pos) {
  }
  public void setText(String text) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char first( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char last( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char setIndex(int p) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char current( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char next( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public char previous( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getBeginIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getEndIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}