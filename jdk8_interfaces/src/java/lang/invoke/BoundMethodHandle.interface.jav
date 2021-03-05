package java.lang.invoke;

import static jdk.internal.org.objectweb.asm.Opcodes.*;
import static java.lang.invoke.LambdaForm.*;
import static java.lang.invoke.LambdaForm.BasicType.*;
import static java.lang.invoke.MethodHandleStatics.*;
import java.lang.invoke.LambdaForm.NamedFunction;
import java.util.concurrent.ConcurrentMap;

abstract class BoundMethodHandle extends MethodHandle {
  BoundMethodHandle(MethodType type, LambdaForm form) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static BoundMethodHandle bindSingle(MethodType type,LambdaForm form,BasicType xtype, Object x) {
                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                 }
  LambdaFormEditor editor( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  static BoundMethodHandle bindSingle(MethodType type,LambdaForm form, Object x) {
                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                 }
  BoundMethodHandle bindArgumentL(int pos, Object value) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  BoundMethodHandle bindArgumentI(int pos, int value) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  BoundMethodHandle bindArgumentJ(int pos, long value) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
  BoundMethodHandle bindArgumentF(int pos, float value) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  BoundMethodHandle bindArgumentD(int pos, double value) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  BoundMethodHandle rebind( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  static BoundMethodHandle makeReinvoker(MethodHandle target) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  abstract SpeciesData speciesData( ) ;
  static SpeciesData speciesData(LambdaForm form) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  abstract int fieldCount( ) ;
  Object internalProperties( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  final Object internalValues( ) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  final Object arg(int i) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
  abstract BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) ;
  abstract BoundMethodHandle copyWithExtendL(MethodType mt,LambdaForm lf, Object narg) ;
  abstract BoundMethodHandle copyWithExtendI(MethodType mt,LambdaForm lf, int narg) ;
  abstract BoundMethodHandle copyWithExtendJ(MethodType mt,LambdaForm lf, long narg) ;
  abstract BoundMethodHandle copyWithExtendF(MethodType mt,LambdaForm lf, float narg) ;
  abstract BoundMethodHandle copyWithExtendD(MethodType mt,LambdaForm lf, double narg) ;
  private static final class Species_L extends BoundMethodHandle {
    final Object argL0;
    SpeciesData speciesData( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    int fieldCount( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    static final SpeciesData SPECIES_DATA;
    static BoundMethodHandle make(MethodType mt,LambdaForm lf, Object argL0) {
                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                             }
    final BoundMethodHandle copyWith(MethodType mt, LambdaForm lf) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    final BoundMethodHandle copyWithExtendL(MethodType mt,LambdaForm lf, Object narg) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
    final BoundMethodHandle copyWithExtendI(MethodType mt,LambdaForm lf, int narg) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
    final BoundMethodHandle copyWithExtendJ(MethodType mt,LambdaForm lf, long narg) {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
    final BoundMethodHandle copyWithExtendF(MethodType mt,LambdaForm lf, float narg) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
    final BoundMethodHandle copyWithExtendD(MethodType mt,LambdaForm lf, double narg) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  }
  static class SpeciesData {
    int fieldCount( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    BasicType fieldType(int i) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
    char fieldTypeChar(int i) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    Object fieldSignature( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
    public Class<? extends BoundMethodHandle> fieldHolder( ) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
    NamedFunction getterFunction(int i) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    NamedFunction [] getterFunctions( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    MethodHandle [] getterHandles( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
    MethodHandle constructor( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    static final SpeciesData EMPTY;
    SpeciesData(String types, Class<? extends BoundMethodHandle> clazz) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    SpeciesData extendWith(byte type) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    SpeciesData extendWith(BasicType type) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    static boolean speciesDataCachePopulated( ) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  }
  static SpeciesData getSpeciesData(String types) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  static class Factory {
    static final String JLO_SIG;
    static final String JLS_SIG;
    static final String JLC_SIG;
    static final String MH;
    static final String MH_SIG;
    static final String BMH;
    static final String BMH_SIG;
    static final String SPECIES_DATA;
    static final String SPECIES_DATA_SIG;
    static final String STABLE_SIG;
    static final String SPECIES_PREFIX_NAME;
    static final String SPECIES_PREFIX_PATH;
    static final String BMHSPECIES_DATA_EWI_SIG;
    static final String BMHSPECIES_DATA_GFC_SIG;
    static final String MYSPECIES_DATA_SIG;
    static final String VOID_SIG;
    static final String INT_SIG;
    static final String SIG_INCIPIT;
    static final String [] E_THROWABLE;
    static final ConcurrentMap<String, Class<? extends BoundMethodHandle>> CLASS_CACHE;
    static Class<? extends BoundMethodHandle> getConcreteBMHClass(String types) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
    static Class<? extends BoundMethodHandle> generateConcreteBMHClass(String types) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
    static String typeSig(char t) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
    static MethodHandle [] makeGetters(Class<?> cbmhClass,String types, MethodHandle [] mhs) {
                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                             }
    static MethodHandle [] makeCtors(Class<? extends BoundMethodHandle> cbmh,String types, MethodHandle mhs[]) {
                                                                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                               }
    static NamedFunction [] makeNominalGetters(String types,NamedFunction [] nfs, MethodHandle [] getters) {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
    static SpeciesData getSpeciesDataFromConcreteBMHClass(Class<? extends BoundMethodHandle> cbmh) {
                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                   }
    static void setSpeciesDataToConcreteBMHClass(Class<? extends BoundMethodHandle> cbmh, SpeciesData speciesData) {
                                                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                   }
    static MethodHandle makeCbmhCtor(Class<? extends BoundMethodHandle> cbmh, String types) {
                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                            }
  }
  static final SpeciesData SPECIES_DATA;
  static SpeciesData speciesData_L( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  static SpeciesData speciesData_LL( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  static SpeciesData speciesData_LLL( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  static SpeciesData speciesData_LLLL( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  static SpeciesData speciesData_LLLLL( ) {
                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                          }
}