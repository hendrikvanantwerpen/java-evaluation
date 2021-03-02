package java.util.regex;


public final class Matcher implements MatchResult {
  Pattern parentPattern;
  int [] groups;
  int from, to;
  int lookbehindTo;
  CharSequence text;
  static final int ENDANCHOR;
  static final int NOANCHOR;
  int acceptMode;
  int first, last;
  int oldLast;
  int lastAppendPosition;
  int [] locals;
  boolean hitEnd;
  boolean requireEnd;
  boolean transparentBounds;
  boolean anchoringBounds;
  Matcher( ) {
  }
  Matcher(Pattern parent, CharSequence text) {
  }
  public Pattern pattern( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public MatchResult toMatchResult( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public Matcher usePattern(Pattern newPattern) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public Matcher reset( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public Matcher reset(CharSequence input) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public int start( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  public int start(int group) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public int start(String name) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int end( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  public int end(int group) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int end(String name) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public String group( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String group(int group) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public String group(String name) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int groupCount( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean matches( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean find( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean find(int start) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public boolean lookingAt( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public static String quoteReplacement(String s) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public Matcher appendReplacement(StringBuffer sb, String replacement) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public StringBuffer appendTail(StringBuffer sb) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public String replaceAll(String replacement) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public String replaceFirst(String replacement) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public Matcher region(int start, int end) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public int regionStart( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int regionEnd( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public boolean hasTransparentBounds( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public Matcher useTransparentBounds(boolean b) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public boolean hasAnchoringBounds( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public Matcher useAnchoringBounds(boolean b) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public boolean hitEnd( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public boolean requireEnd( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  boolean search(int from) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  boolean match(int from, int anchor) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  int getTextLength( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  CharSequence getSubSequence(int beginIndex, int endIndex) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  char charAt(int i) {
                       throw new java . lang . RuntimeException ("Implementation stripped");
                     }
  int getMatchedGroupIndex(String name) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
}