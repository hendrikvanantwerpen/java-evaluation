package java.lang.invoke;

import java.lang.ref.SoftReference;
import static java.lang.invoke.MethodHandleStatics.*;

final class MethodTypeForm {
  final int [] argToSlotTable, slotToArgTable;
  final long argCounts;
  final long primCounts;
  final MethodType erasedType;
  final MethodType basicType;
  final SoftReference<MethodHandle> [] methodHandles;
  static final int MH_BASIC_INV, MH_NF_INV, MH_UNINIT_CS, MH_LIMIT;
  final SoftReference<LambdaForm> [] lambdaForms;
  static final int LF_INVVIRTUAL, LF_INVSTATIC, LF_INVSPECIAL, LF_NEWINVSPECIAL, LF_INVINTERFACE, LF_INVSTATIC_INIT, LF_INTERPRET, LF_REBIND, LF_DELEGATE, LF_DELEGATE_BLOCK_INLINING, LF_EX_LINKER, LF_EX_INVOKER, LF_GEN_LINKER, LF_GEN_INVOKER, LF_CS_LINKER, LF_MH_LINKER, LF_GWC, LF_GWT, LF_LIMIT;
  public MethodType erasedType( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public MethodType basicType( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  public MethodHandle cachedMethodHandle(int which) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  synchronized public MethodHandle setCachedMethodHandle(int which, MethodHandle mh) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
  public LambdaForm cachedLambdaForm(int which) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  synchronized public LambdaForm setCachedLambdaForm(int which, LambdaForm form) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  public int parameterCount( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public int parameterSlotCount( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  public int returnCount( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public int returnSlotCount( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public int primitiveParameterCount( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  public int longPrimitiveParameterCount( ) {
                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                            }
  public int primitiveReturnCount( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public int longPrimitiveReturnCount( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public boolean hasPrimitives( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  public boolean hasNonVoidPrimitives( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public boolean hasLongPrimitives( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public int parameterToArgSlot(int i) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public int argSlotToParameter(int argSlot) {
                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                             }
  static MethodTypeForm findForm(MethodType mt) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public static final int NO_CHANGE, ERASE, WRAP, UNWRAP, INTS, LONGS, RAW_RETURN;
  public static MethodType canonicalize(MethodType mt,int howRet, int howArgs) {
                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                               }
  static Class<?> canonicalize(Class<?> t, int how) {
                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                    }
  static Class<?> [] canonicalizeAll(Class<?> [] ts, int how) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
}