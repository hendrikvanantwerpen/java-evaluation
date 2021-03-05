package java.lang.invoke;

import java.lang.reflect.*;
import java.util.*;
import java.lang.invoke.MethodHandles.Lookup;
import static java.lang.invoke.MethodHandleStatics.*;

public interface MethodHandleInfo {
  public int getReferenceKind( ) ;
  public Class<?> getDeclaringClass( ) ;
  public String getName( ) ;
  public MethodType getMethodType( ) ;
  public <T extends Member> T reflectAs(Class<T> expected, Lookup lookup) ;
  public int getModifiers( ) ;
  public default boolean isVarArgs( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public static String referenceKindToString(int referenceKind) {
                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                }
  public static String toString(int kind,Class<?> defc,String name, MethodType type) {
                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                     }
}