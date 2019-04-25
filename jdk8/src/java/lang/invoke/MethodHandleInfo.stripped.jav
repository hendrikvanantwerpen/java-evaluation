package java.lang.invoke;

import java.lang.reflect.*;
import java.util.*;
import java.lang.invoke.MethodHandles.Lookup;

public interface MethodHandleInfo {
  public static final int REF_getField, REF_getStatic, REF_putField, REF_putStatic, REF_invokeVirtual, REF_invokeStatic, REF_invokeSpecial, REF_newInvokeSpecial, REF_invokeInterface
  ;
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