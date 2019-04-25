package java.text;

import java.util.Locale;

public abstract class BreakIterator implements Cloneable {
  protected BreakIterator( ) {
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final int DONE;
  public abstract int first( ) ;
  public abstract int last( ) ;
  public abstract int next(int n) ;
  public abstract int next( ) ;
  public abstract int previous( ) ;
  public abstract int following(int offset) ;
  public int preceding(int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBoundary(int offset) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int current( ) ;
  public abstract CharacterIterator getText( ) ;
  public void setText(String newText) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract void setText(CharacterIterator newText) ;
  public static BreakIterator getWordInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getWordInstance(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getLineInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getLineInstance(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getCharacterInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getCharacterInstance(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getSentenceInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static BreakIterator getSentenceInstance(Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized Locale [] getAvailableLocales( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}