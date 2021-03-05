package java.lang.invoke;

import java.lang.ref.SoftReference;
import static java.lang.invoke.LambdaForm.*;
import static java.lang.invoke.LambdaForm.BasicType.*;

class LambdaFormEditor {
  final LambdaForm lambdaForm;
  static LambdaFormEditor lambdaFormEditor(LambdaForm lambdaForm) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  private static final class Transform extends SoftReference<LambdaForm> {
    final long packedBytes;
    final byte [] fullBytes;
    private enum Kind {
    }
    Kind kind( ) {
                   throw new java . lang . RuntimeException ("Implementation stripped");
                 }
    static Transform of(Kind k, int b1) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    static Transform of(Kind k,int b1, int b2) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
    static Transform of(Kind k,int b1,int b2, int b3) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
    static Transform of(Kind k, int ... b123) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
    static Transform of(Kind k,int b1, byte [] b234) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
    static Transform of(Kind k,int b1,int b2, byte [] b345) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    Transform withResult(LambdaForm result) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public boolean equals(Transform that) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  BoundMethodHandle bindArgumentL(BoundMethodHandle mh,int pos, Object value) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  BoundMethodHandle bindArgumentI(BoundMethodHandle mh,int pos, int value) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  BoundMethodHandle bindArgumentJ(BoundMethodHandle mh,int pos, long value) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  BoundMethodHandle bindArgumentF(BoundMethodHandle mh,int pos, float value) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
  BoundMethodHandle bindArgumentD(BoundMethodHandle mh,int pos, double value) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  LambdaForm bindArgumentForm(int pos) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  LambdaForm addArgumentForm(int pos, BasicType type) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  LambdaForm dupArgumentForm(int srcPos, int dstPos) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  LambdaForm spreadArgumentsForm(int pos,Class<?> arrayType, int arrayLength) {
                                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                                              }
  LambdaForm collectArgumentsForm(int pos, MethodType collectorType) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  LambdaForm collectArgumentArrayForm(int pos, MethodHandle arrayCollector) {
                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                            }
  LambdaForm filterArgumentForm(int pos, BasicType newType) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  LambdaForm filterReturnForm(BasicType newType, boolean constantZero) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  LambdaForm foldArgumentsForm(int foldPos,boolean dropResult, MethodType combinerType) {
                                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                        }
  LambdaForm permuteArgumentsForm(int skip, int [] reorder) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
  static boolean permutedTypesMatch(int [] reorder,BasicType [] types,Name [] names, int skip) {
                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                               }
}