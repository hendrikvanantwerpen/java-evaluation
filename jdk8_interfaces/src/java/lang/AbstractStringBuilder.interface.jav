package java.lang;


abstract class AbstractStringBuilder implements Appendable, CharSequence {
  char [] value;
  int count;
  AbstractStringBuilder( ) {
  }
  AbstractStringBuilder(int capacity) {
  }
  public int length( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public int capacity( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public void ensureCapacity(int minimumCapacity) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private void ensureCapacityInternal(int minimumCapacity) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private static final int MAX_ARRAY_SIZE;
  private int newCapacity(int minCapacity) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private int hugeCapacity(int minCapacity) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public void trimToSize( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public void setLength(int newLength) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public char charAt(int index) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int codePointAt(int index) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public int codePointBefore(int index) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int codePointCount(int beginIndex, int endIndex) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public int offsetByCodePoints(int index, int codePointOffset) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public void getChars(int srcBegin,int srcEnd,char [] dst, int dstBegin) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public void setCharAt(int index, char ch) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public AbstractStringBuilder append(Object obj) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public AbstractStringBuilder append(String str) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public AbstractStringBuilder append(StringBuffer sb) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  AbstractStringBuilder append(AbstractStringBuilder asb) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public AbstractStringBuilder append(CharSequence s) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  private AbstractStringBuilder appendNull( ) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public AbstractStringBuilder append(CharSequence s,int start, int end) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public AbstractStringBuilder append(char [] str) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public AbstractStringBuilder append(char str[],int offset, int len) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public AbstractStringBuilder append(boolean b) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public AbstractStringBuilder append(char c) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public AbstractStringBuilder append(int i) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public AbstractStringBuilder append(long l) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public AbstractStringBuilder append(float f) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public AbstractStringBuilder append(double d) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public AbstractStringBuilder delete(int start, int end) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public AbstractStringBuilder appendCodePoint(int codePoint) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public AbstractStringBuilder deleteCharAt(int index) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public AbstractStringBuilder replace(int start,int end, String str) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public String substring(int start) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public CharSequence subSequence(int start, int end) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public String substring(int start, int end) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public AbstractStringBuilder insert(int index,char [] str,int offset, int len) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public AbstractStringBuilder insert(int offset, Object obj) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public AbstractStringBuilder insert(int offset, String str) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public AbstractStringBuilder insert(int offset, char [] str) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public AbstractStringBuilder insert(int dstOffset, CharSequence s) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  public AbstractStringBuilder insert(int dstOffset,CharSequence s,int start, int end) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  public AbstractStringBuilder insert(int offset, boolean b) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public AbstractStringBuilder insert(int offset, char c) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public AbstractStringBuilder insert(int offset, int i) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  public AbstractStringBuilder insert(int offset, long l) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  public AbstractStringBuilder insert(int offset, float f) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public AbstractStringBuilder insert(int offset, double d) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public int indexOf(String str) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public int indexOf(String str, int fromIndex) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int lastIndexOf(String str) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public int lastIndexOf(String str, int fromIndex) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public AbstractStringBuilder reverse( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private void reverseAllValidSurrogatePairs( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public abstract String toString( ) ;
  final char [] getValue( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}