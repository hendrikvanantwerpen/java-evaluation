package java.io;


public class StreamTokenizer {
  public int ttype;
  public static final int TT_EOF;
  public static final int TT_EOL;
  public static final int TT_NUMBER;
  public static final int TT_WORD;
  public String sval;
  public double nval;
  private StreamTokenizer( ) {
  }
  @Deprecated public StreamTokenizer(InputStream is) {
    this( );
  }
  public StreamTokenizer(Reader r) {
    this( );
  }
  public void resetSyntax( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void wordChars(int low, int hi) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void whitespaceChars(int low, int hi) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void ordinaryChars(int low, int hi) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void ordinaryChar(int ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void commentChar(int ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void quoteChar(int ch) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void parseNumbers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void eolIsSignificant(boolean flag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void slashStarComments(boolean flag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void slashSlashComments(boolean flag) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void lowerCaseMode(boolean fl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int nextToken( ) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void pushBack( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int lineno( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}