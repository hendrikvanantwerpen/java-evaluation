package sun.invoke.util;


public enum Wrapper {
  BOOLEAN (null), BYTE (null), SHORT (null), CHAR (null), INT (null), LONG (null), FLOAT (null), DOUBLE (null), OBJECT (null), VOID (null),
  ;  private final Class<?> wrapperType;
     private final Class<?> primitiveType;
     private final char basicTypeChar;
     private final Object zero;
     private final Object emptyArray;
     private final int format;
     private final String wrapperSimpleName;
     private final String primitiveSimpleName;
     private Wrapper(Class<?> wtype,Class<?> ptype,char tchar,Object zero,Object emptyArray, int format) {
     }
     public String detailString( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
     private static abstract class Format {
       static final int SLOT_SHIFT, SIZE_SHIFT, KIND_SHIFT;
       static final int SIGNED, UNSIGNED, FLOATING;
       static final int SLOT_MASK, SIZE_MASK;
       static int format(int kind,int size, int slots) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
       static final int INT, SHORT, BOOLEAN, CHAR, FLOAT, VOID, NUM_MASK;
       static int signed(int size) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
       static int unsigned(int size) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
       static int floating(int size) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
       static int other(int slots) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
     }
     public int bitWidth( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
     public int stackSlots( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
     public boolean isSingleWord( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
     public boolean isDoubleWord( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
     public boolean isNumeric( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
     public boolean isIntegral( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
     public boolean isSubwordOrInt( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
     public boolean isSigned( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
     public boolean isUnsigned( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
     public boolean isFloating( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
     public boolean isOther( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
     public boolean isConvertibleFrom(Wrapper source) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
     static {
              throw new java . lang . RuntimeException ("Implementation stripped");
            }
     private static boolean checkConvertibleFrom( ) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
     public Object zero( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
     public <T> T zero(Class<T> type) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
     public static Wrapper forPrimitiveType(Class<?> type) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
     static Wrapper findPrimitiveType(Class<?> type) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
     public static Wrapper forWrapperType(Class<?> type) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
     static Wrapper findWrapperType(Class<?> type) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
     public static Wrapper forBasicType(char type) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
     public static Wrapper forBasicType(Class<?> type) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
     private static final Wrapper [] FROM_PRIM;
     private static final Wrapper [] FROM_WRAP;
     private static final Wrapper [] FROM_CHAR;
     private static int hashPrim(Class<?> x) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
     private static int hashWrap(Class<?> x) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
     private static int hashChar(char x) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
     static {
              throw new java . lang . RuntimeException ("Implementation stripped");
            }
     public Class<?> primitiveType( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
     public Class<?> wrapperType( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
     public <T> Class<T> wrapperType(Class<T> exampleType) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
     private static ClassCastException newClassCastException(Class<?> actual, Class<?> expected) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
     public static <T> Class<T> asWrapperType(Class<T> type) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
     public static <T> Class<T> asPrimitiveType(Class<T> type) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
     public static boolean isWrapperType(Class<?> type) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
     public static boolean isPrimitiveType(Class<?> type) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
     public static char basicTypeChar(Class<?> type) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
     public char basicTypeChar( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
     public String wrapperSimpleName( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
     public String primitiveSimpleName( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
     public <T> T cast(Object x, Class<T> type) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
     public <T> T convert(Object x, Class<T> type) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
     private <T> T convert(Object x,Class<T> type, boolean isCast) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
     static <T> Class<T> forceType(Class<?> type, Class<T> exampleType) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
     public Object wrap(Object x) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
     public Object wrap(int x) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
     private static Number numberValue(Object x) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
     private static boolean boolValue(byte bits) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
     private static RuntimeException newIllegalArgumentException(String message, Object x) {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
     private static RuntimeException newIllegalArgumentException(String message) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
     public Object makeArray(int len) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
     public Class<?> arrayType( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
     public void copyArrayUnboxing(Object [] values,int vpos,Object a,int apos, int length) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
     public void copyArrayBoxing(Object a,int apos,Object [] values,int vpos, int length) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
}