package java.lang.reflect;

import java.lang.annotation.Annotation;

public interface AnnotatedElement {
  default boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  <T extends Annotation> T getAnnotation(Class<T> annotationClass) ;
  Annotation [] getAnnotations( ) ;
  default <T extends Annotation> T [] getAnnotationsByType(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default <T extends Annotation> T getDeclaredAnnotation(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  default <T extends Annotation> T [] getDeclaredAnnotationsByType(Class<T> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  Annotation [] getDeclaredAnnotations( ) ;
}