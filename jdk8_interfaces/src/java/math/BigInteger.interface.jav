package java.math;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.util.Random;

public class BigInteger extends Number implements Comparable<BigInteger> {
  final int signum;
  final int [] mag;
  private int bitCount;
  private int bitLength;
  private int lowestSetBit;
  private int firstNonzeroIntNum;
  final static long LONG_MASK;
  private static final int MAX_MAG_LENGTH;
  private static final int PRIME_SEARCH_BIT_LENGTH_LIMIT;
  private static final int KARATSUBA_THRESHOLD;
  private static final int TOOM_COOK_THRESHOLD;
  private static final int KARATSUBA_SQUARE_THRESHOLD;
  private static final int TOOM_COOK_SQUARE_THRESHOLD;
  static final int BURNIKEL_ZIEGLER_THRESHOLD;
  static final int BURNIKEL_ZIEGLER_OFFSET;
  private static final int SCHOENHAGE_BASE_CONVERSION_THRESHOLD;
  private static final int MULTIPLY_SQUARE_THRESHOLD;
  private static final int MONTGOMERY_INTRINSIC_THRESHOLD;
  public BigInteger(byte [] val) {
  }
  private BigInteger(int [] val) {
  }
  public BigInteger(int signum, byte [] magnitude) {
  }
  private BigInteger(int signum, int [] magnitude) {
  }
  public BigInteger(String val, int radix) {
  }
  BigInteger(char [] val,int sign, int len) {
  }
  private int parseInt(char [] source,int start, int end) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private static long bitsPerDigit[];
  private static void destructiveMulAdd(int [] x,int y, int z) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public BigInteger(String val) {
    this(val, 10);
  }
  public BigInteger(int numBits, Random rnd) {
    this(1, randomBits(numBits, rnd));
  }
  private static byte [] randomBits(int numBits, Random rnd) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public BigInteger(int bitLength,int certainty, Random rnd) {
  }
  private static final int SMALL_PRIME_THRESHOLD;
  private static final int DEFAULT_PRIME_CERTAINTY;
  public static BigInteger probablePrime(int bitLength, Random rnd) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static BigInteger smallPrime(int bitLength,int certainty, Random rnd) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  private static final BigInteger SMALL_PRIME_PRODUCT;
  private static BigInteger largePrime(int bitLength,int certainty, Random rnd) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  public BigInteger nextProbablePrime( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  private static int getPrimeSearchLen(int bitLength) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  boolean primeToCertainty(int certainty, Random random) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private boolean passesLucasLehmer( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private static int jacobiSymbol(int p, BigInteger n) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static BigInteger lucasLehmerSequence(int z,BigInteger k, BigInteger n) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  private boolean passesMillerRabin(int iterations, Random rnd) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  BigInteger(int [] magnitude, int signum) {
  }
  private BigInteger(byte [] magnitude, int signum) {
  }
  private void checkRange( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  private static void reportOverflow( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public static BigInteger valueOf(long val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private BigInteger(long val) {
  }
  private static BigInteger valueOf(int val[]) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private final static int MAX_CONSTANT;
  private static BigInteger posConst[];
  private static BigInteger negConst[];
  private static volatile BigInteger [] [] powerCache;
  private static final double [] logCache;
  private static final double LOG_TWO;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  public static final BigInteger ZERO;
  public static final BigInteger ONE;
  private static final BigInteger TWO;
  private static final BigInteger NEGATIVE_ONE;
  public static final BigInteger TEN;
  public BigInteger add(BigInteger val) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  BigInteger add(long val) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  private static int [] add(int [] x, long val) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private static int [] add(int [] x, int [] y) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  private static int [] subtract(long val, int [] little) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private static int [] subtract(int [] big, long val) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  public BigInteger subtract(BigInteger val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private static int [] subtract(int [] big, int [] little) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  public BigInteger multiply(BigInteger val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  private BigInteger multiply(BigInteger val, boolean isRecursion) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  private static BigInteger multiplyByInt(int [] x,int y, int sign) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  BigInteger multiply(long v) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  private static int [] multiplyToLen(int [] x,int xlen,int [] y,int ylen, int [] z) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  private static BigInteger multiplyKaratsuba(BigInteger x, BigInteger y) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static BigInteger multiplyToomCook3(BigInteger a, BigInteger b) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private BigInteger getToomSlice(int lowerSize,int upperSize,int slice, int fullsize) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
  private BigInteger exactDivideBy3( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  private BigInteger getLower(int n) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private BigInteger getUpper(int n) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private BigInteger square( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private BigInteger square(boolean isRecursion) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private static final int [] squareToLen(int [] x,int len, int [] z) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private static void implSquareToLenChecks(int [] x,int len,int [] z, int zlen) throws RuntimeException {
                                                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                         }
  private static final int [] implSquareToLen(int [] x,int len,int [] z, int zlen) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  private BigInteger squareKaratsuba( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private BigInteger squareToomCook3( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public BigInteger divide(BigInteger val) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  private BigInteger divideKnuth(BigInteger val) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public BigInteger [] divideAndRemainder(BigInteger val) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private BigInteger [] divideAndRemainderKnuth(BigInteger val) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public BigInteger remainder(BigInteger val) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private BigInteger remainderKnuth(BigInteger val) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  private BigInteger divideBurnikelZiegler(BigInteger val) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private BigInteger remainderBurnikelZiegler(BigInteger val) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private BigInteger [] divideAndRemainderBurnikelZiegler(BigInteger val) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  public BigInteger pow(int exponent) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public BigInteger gcd(BigInteger val) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  static int bitLengthForInt(int n) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private static int [] leftShift(int [] a,int len, int n) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static void primitiveRightShift(int [] a,int len, int n) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  static void primitiveLeftShift(int [] a,int len, int n) {
                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                          }
  private static int bitLength(int [] val, int len) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  public BigInteger abs( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public BigInteger negate( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public int signum( ) {
                         throw new java . lang . RuntimeException ("Implementation stripped");
                       }
  public BigInteger mod(BigInteger m) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public BigInteger modPow(BigInteger exponent, BigInteger m) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  private static int [] montgomeryMultiply(int [] a,int [] b,int [] n,int len,long inv, int [] product) {
                                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                        }
  private static int [] montgomerySquare(int [] a,int [] n,int len,long inv, int [] product) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
  private static void implMontgomeryMultiplyChecks(int [] a,int [] b,int [] n,int len, int [] product) throws RuntimeException {
                                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                               }
  private static int [] materialize(int [] z, int len) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  private static int [] implMontgomeryMultiply(int [] a,int [] b,int [] n,int len,long inv, int [] product) {
                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                            }
  private static int [] implMontgomerySquare(int [] a,int [] n,int len,long inv, int [] product) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  static int [] bnExpModThreshTable;
  private BigInteger oddModPow(BigInteger y, BigInteger z) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  private static int [] montReduce(int [] n,int [] mod,int mlen, int inv) {
                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                          }
  private static int intArrayCmpToLen(int [] arg1,int [] arg2, int len) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  private static int subN(int [] a,int [] b, int len) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  static int mulAdd(int [] out,int [] in,int offset,int len, int k) {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private static void implMulAddCheck(int [] out,int [] in,int offset,int len, int k) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  private static int implMulAdd(int [] out,int [] in,int offset,int len, int k) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
  static int addOne(int [] a,int offset,int mlen, int carry) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  private BigInteger modPow2(BigInteger exponent, int p) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  private BigInteger mod2(int p) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public BigInteger modInverse(BigInteger m) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  public BigInteger shiftLeft(int n) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  private static int [] shiftLeft(int [] mag, int n) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public BigInteger shiftRight(int n) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  private BigInteger shiftRightImpl(int n) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  int [] javaIncrement(int [] val) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public BigInteger and(BigInteger val) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public BigInteger or(BigInteger val) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public BigInteger xor(BigInteger val) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public BigInteger not( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public BigInteger andNot(BigInteger val) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
  public boolean testBit(int n) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public BigInteger setBit(int n) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public BigInteger clearBit(int n) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public BigInteger flipBit(int n) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int getLowestSetBit( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int bitLength( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  public int bitCount( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public boolean isProbablePrime(int certainty) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public int compareTo(BigInteger val) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  final int compareMagnitude(BigInteger val) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  final int compareMagnitude(long val) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public boolean equals(Object x) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public BigInteger min(BigInteger val) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public BigInteger max(BigInteger val) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int hashCode( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public String toString(int radix) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private String smallToString(int radix) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
  private static void toString(BigInteger u,StringBuilder sb,int radix, int digits) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  private static BigInteger getRadixConversionCache(int radix, int exponent) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  private static String zeros[];
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public byte [] toByteArray( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int intValue( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  public long longValue( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public float floatValue( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  public double doubleValue( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  private static int [] stripLeadingZeroInts(int val[]) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static int [] trustedStripLeadingZeroInts(int val[]) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  private static int [] stripLeadingZeroBytes(byte a[]) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  private static int [] makePositive(byte a[]) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  private static int [] makePositive(int a[]) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  private static int digitsPerLong[];
  private static BigInteger longRadix[];
  private static int digitsPerInt[];
  private static int intRadix[];
  private int intLength( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  private int signBit( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private int signInt( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
  private int getInt(int n) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  private int firstNonzeroIntNum( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  private static final long serialVersionUID;
  private static final ObjectStreamField [] serialPersistentFields;
  private void readObject(java. io. ObjectInputStream s) throws java. io. IOException, ClassNotFoundException {
                                                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                              }
  private static class UnsafeHolder {
    private static final sun. misc. Unsafe unsafe;
    private static final long signumOffset;
    private static final long magOffset;
    static {
             throw new java . lang . RuntimeException ("Implementation stripped");
           }
    static void putSign(BigInteger bi, int sign) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    static void putMag(BigInteger bi, int [] magnitude) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  }
  private void writeObject(ObjectOutputStream s) throws IOException {
                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                    }
  private byte [] magSerializedForm( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public long longValueExact( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int intValueExact( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public short shortValueExact( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public byte byteValueExact( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
}