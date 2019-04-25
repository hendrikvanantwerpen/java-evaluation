package java.lang.invoke;

import java.lang.reflect.*;
import java.util.List;

public class MethodHandles {
  private MethodHandles( ) {
  }
  public static Lookup lookup( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Lookup publicLookup( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T extends Member> T reflectAs(Class<T> expected, MethodHandle target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final class Lookup {
    public static final int PUBLIC;
    public static final int PRIVATE;
    public static final int PROTECTED;
    public static final int PACKAGE;
    public Class<?> lookupClass( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int lookupModes( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Lookup(Class<?> lookupClass) {
      this(lookupClass, ALL_MODES);
    }
    private Lookup(Class<?> lookupClass, int allowedModes) {
    }
    public Lookup in(Class<?> requestedLookupClass) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toString( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findStatic(Class<?> refc,String name, MethodType type) throws NoSuchMethodException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findVirtual(Class<?> refc,String name, MethodType type) throws NoSuchMethodException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findConstructor(Class<?> refc, MethodType type) throws NoSuchMethodException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findSpecial(Class<?> refc,String name,MethodType type, Class<?> specialCaller) throws NoSuchMethodException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findGetter(Class<?> refc,String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findSetter(Class<?> refc,String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findStaticGetter(Class<?> refc,String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle findStaticSetter(Class<?> refc,String name, Class<?> type) throws NoSuchFieldException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle bind(Object receiver,String name, MethodType type) throws NoSuchMethodException, IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle unreflect(Method m) throws IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle unreflectSpecial(Method m, Class<?> specialCaller) throws IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle unreflectConstructor(Constructor<?> c) throws IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle unreflectGetter(Field f) throws IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandle unreflectSetter(Field f) throws IllegalAccessException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public MethodHandleInfo revealDirect(MethodHandle target) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public static MethodHandle arrayElementGetter(Class<?> arrayClass) throws IllegalArgumentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle arrayElementSetter(Class<?> arrayClass) throws IllegalArgumentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static public MethodHandle spreadInvoker(MethodType type, int leadingArgCount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static public MethodHandle exactInvoker(MethodType type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  static public MethodHandle invoker(MethodType type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle explicitCastArguments(MethodHandle target, MethodType newType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle permuteArguments(MethodHandle target,MethodType newType, int ... reorder) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle constant(Class<?> type, Object value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle identity(Class<?> type) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle insertArguments(MethodHandle target,int pos, Object ... values) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle dropArguments(MethodHandle target,int pos, List<Class<?>> valueTypes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle dropArguments(MethodHandle target,int pos, Class<?> ... valueTypes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle filterArguments(MethodHandle target,int pos, MethodHandle ... filters) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle collectArguments(MethodHandle target,int pos, MethodHandle filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle filterReturnValue(MethodHandle target, MethodHandle filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle foldArguments(MethodHandle target, MethodHandle combiner) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle guardWithTest(MethodHandle test,MethodHandle target, MethodHandle fallback) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle catchException(MethodHandle target,Class<? extends Throwable> exType, MethodHandle handler) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodHandle throwException(Class<?> returnType, Class<? extends Throwable> exType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}