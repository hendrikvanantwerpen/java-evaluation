package java.lang.invoke;

import java.util.*;

public abstract class MethodHandle {
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
  @interface PolymorphicSignature {
  }
  private final MethodType type;
  final LambdaForm form;
  MethodHandle asTypeCache;
  byte customizationCount;
  public MethodType type( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  MethodHandle(MethodType type, LambdaForm form) {
  }
  public final native Object invokeExact(Object ... args) throws Throwable ;
  public final native Object invoke(Object ... args) throws Throwable ;
  final native Object invokeBasic(Object ... args) throws Throwable ;
  static native Object linkToVirtual(Object ... args) throws Throwable ;
  static native Object linkToStatic(Object ... args) throws Throwable ;
  static native Object linkToSpecial(Object ... args) throws Throwable ;
  static native Object linkToInterface(Object ... args) throws Throwable ;
  public Object invokeWithArguments(Object ... arguments) throws Throwable {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public Object invokeWithArguments(java. util. List<?> arguments) throws Throwable {
                                                                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                    }
  public MethodHandle asType(MethodType newType) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  private MethodHandle asTypeCached(MethodType newType) {
                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                        }
  MethodHandle asTypeUncached(MethodType newType) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public MethodHandle asSpreader(Class<?> arrayType, int arrayLength) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  private MethodType asSpreaderChecks(Class<?> arrayType, int arrayLength) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  private void spreadArrayChecks(Class<?> arrayType, int arrayLength) {
                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                      }
  public MethodHandle asCollector(Class<?> arrayType, int arrayLength) {
                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                       }
  boolean asCollectorChecks(Class<?> arrayType, int arrayLength) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public MethodHandle asVarargsCollector(Class<?> arrayType) {
                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                             }
  public boolean isVarargsCollector( ) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public MethodHandle asFixedArity( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public MethodHandle bindTo(Object x) {
                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                       }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  String standardString( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  String debugString( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  BoundMethodHandle bindArgumentL(int pos, Object value) {
                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                         }
  MethodHandle setVarargs(MemberName member) throws IllegalAccessException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  MethodHandle viewAsType(MethodType newType, boolean strict) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  boolean viewAsTypeChecks(MethodType newType, boolean strict) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  LambdaForm internalForm( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  MemberName internalMemberName( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  Class<?> internalCallerClass( ) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  MethodHandleImpl. Intrinsic intrinsicName( ) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  MethodHandle withInternalMemberName(MemberName member, boolean isInvokeSpecial) {
                                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                  }
  boolean isInvokeSpecial( ) {
                               throw new java . lang . RuntimeException ("Implementation stripped");
                             }
  Object internalValues( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  Object internalProperties( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  abstract MethodHandle copyWith(MethodType mt, LambdaForm lf) ;
  abstract BoundMethodHandle rebind( ) ;
  void updateForm(LambdaForm newForm) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  void customize( ) {
                      throw new java . lang . RuntimeException ("Implementation stripped");
                    }
  private static final long FORM_OFFSET;
  static {
           throw new java . lang . RuntimeException ("Implementation stripped");
         }
}