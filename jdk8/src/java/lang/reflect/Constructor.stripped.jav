package java.lang.reflect;

import java.lang.annotation.Annotation;

public final class Constructor<T> extends Executable {
  Constructor(Class<T> declaringClass,Class<?> [] parameterTypes,Class<?> [] checkedExceptions,int modifiers,int slot,String signature,byte [] annotations, byte [] parameterAnnotations) {
  }
  public Class<T> getDeclaringClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getModifiers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TypeVariable<Constructor<T>> [] getTypeParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> [] getParameterTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getParameterCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Type [] getGenericParameterTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> [] getExceptionTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Type [] getGenericExceptionTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toGenericString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T newInstance(Object ... initargs) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isVarArgs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSynthetic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] getDeclaredAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] [] getParameterAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AnnotatedType getAnnotatedReturnType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AnnotatedType getAnnotatedReceiverType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}