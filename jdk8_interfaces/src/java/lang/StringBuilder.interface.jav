package java.lang;


public final class StringBuilder extends AbstractStringBuilder implements java. io. Serializable, CharSequence {
  static final long serialVersionUID;
  public StringBuilder( ) {
    super(16);
  }
  public StringBuilder(int capacity) {
    super(capacity);
  }
  public StringBuilder(String str) {
    super(str. length( ) + 16);
  }
  public StringBuilder(CharSequence seq) {
    this(seq. length( ) + 16);
  }
  public StringBuilder append(Object obj) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public StringBuilder append(String str) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  public StringBuilder append(StringBuffer sb) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public StringBuilder append(CharSequence s) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public StringBuilder append(CharSequence s,int start, int end) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public StringBuilder append(char [] str) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public StringBuilder append(char [] str,int offset, int len) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public StringBuilder append(boolean b) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public StringBuilder append(char c) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public StringBuilder append(int i) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public StringBuilder append(long lng) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public StringBuilder append(float f) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public StringBuilder append(double d) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public StringBuilder appendCodePoint(int codePoint) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public StringBuilder delete(int start, int end) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public StringBuilder deleteCharAt(int index) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public StringBuilder replace(int start,int end, String str) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public StringBuilder insert(int index,char [] str,int offset, int len) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public StringBuilder insert(int offset, Object obj) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public StringBuilder insert(int offset, String str) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public StringBuilder insert(int offset, char [] str) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public StringBuilder insert(int dstOffset, CharSequence s) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public StringBuilder insert(int dstOffset,CharSequence s,int start, int end) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  public StringBuilder insert(int offset, boolean b) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public StringBuilder insert(int offset, char c) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public StringBuilder insert(int offset, int i) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public StringBuilder insert(int offset, long l) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public StringBuilder insert(int offset, float f) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  public StringBuilder insert(int offset, double d) {
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
  public StringBuilder reverse( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private void writeObject(java. io. ObjectOutputStream s) throws java. io. IOException {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
}