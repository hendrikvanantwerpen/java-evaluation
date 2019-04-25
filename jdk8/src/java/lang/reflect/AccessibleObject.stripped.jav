package java.lang.reflect;

import java.lang.annotation.Annotation;

public class AccessibleObject implements AnnotatedElement {
  public static void setAccessible(AccessibleObject [] array, boolean flag) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setAccessible(boolean flag) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAccessible( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected AccessibleObject( ) {
  }
  public <T extends Annotation> T getAnnotation(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends Annotation> T [] getAnnotationsByType(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] getAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <T extends Annotation> T [] getDeclaredAnnotationsByType(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] getDeclaredAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}