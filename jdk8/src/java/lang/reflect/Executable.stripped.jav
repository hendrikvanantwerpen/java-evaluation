package java.lang.reflect;

import java.lang.annotation.*;

public abstract class Executable extends AccessibleObject implements Member, GenericDeclaration {
  Executable( ) {
  }
  public abstract Class<?> getDeclaringClass( ) ;
  public abstract String getName( ) ;
  public abstract int getModifiers( ) ;
  public abstract TypeVariable<?> [] getTypeParameters( ) ;
  public abstract Class<?> [] getParameterTypes( ) ;
  public int getParameterCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Type [] getGenericParameterTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Parameter [] getParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Class<?> [] getExceptionTypes( ) ;
  public Type [] getGenericExceptionTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract String toGenericString( ) ;
  public boolean isVarArgs( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSynthetic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Annotation [] [] getParameterAnnotations( ) ;
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends Annotation> T [] getAnnotationsByType(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] getDeclaredAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract AnnotatedType getAnnotatedReturnType( ) ;
  public AnnotatedType getAnnotatedReceiverType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AnnotatedType [] getAnnotatedParameterTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AnnotatedType [] getAnnotatedExceptionTypes( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}