package java.lang.reflect;

import sun.reflect.ReflectionFactory;
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
  boolean override;
  static final ReflectionFactory reflectionFactory;
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
  volatile Object securityCheckCache;
  void checkAccess(Class<?> caller,Class<?> clazz,Object obj, int modifiers) throws IllegalAccessException {
                                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                           }
  void slowCheckMemberAccess(Class<?> caller,Class<?> clazz,Object obj,int modifiers, Class<?> targetClass) throws IllegalAccessException {
                                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                          }
}