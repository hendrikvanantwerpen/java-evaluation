package java.lang;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.AnnotatedType;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import sun.reflect.annotation.*;

public final class Class<T> implements java. io. Serializable, GenericDeclaration, Type, AnnotatedElement {
  private Class( ) {
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toGenericString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> forName(String className) throws ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Class<?> forName(String name,boolean initialize, ClassLoader loader) throws ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T newInstance( ) throws InstantiationException, IllegalAccessException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public native boolean isInstance(Object obj) ;
  public native boolean isAssignableFrom(Class<?> cls) ;
  public native boolean isInterface( ) ;
  public native boolean isArray( ) ;
  public native boolean isPrimitive( ) ;
  public boolean isAnnotation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSynthetic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ClassLoader getClassLoader( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public TypeVariable<Class<T>> [] getTypeParameters( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public native Class<? super T> getSuperclass( ) ;
  public Type getGenericSuperclass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Package getPackage( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> [] getInterfaces( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Type [] getGenericInterfaces( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public native Class<?> getComponentType( ) ;
  public native int getModifiers( ) ;
  public native Object [] getSigners( ) ;
  public Method getEnclosingMethod( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Constructor<?> getEnclosingConstructor( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> getDeclaringClass( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> getEnclosingClass( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getSimpleName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getTypeName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getCanonicalName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAnonymousClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isLocalClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isMemberClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> [] getClasses( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Field [] getFields( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Method [] getMethods( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Constructor<?> [] getConstructors( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Field getField(String name) throws NoSuchFieldException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Method getMethod(String name, Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Constructor<T> getConstructor(Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> [] getDeclaredClasses( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Field [] getDeclaredFields( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Method [] getDeclaredMethods( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Constructor<?> [] getDeclaredConstructors( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Field getDeclaredField(String name) throws NoSuchFieldException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Method getDeclaredMethod(String name, Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Constructor<T> getDeclaredConstructor(Class<?> ... parameterTypes) throws NoSuchMethodException, SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputStream getResourceAsStream(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. net. URL getResource(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public java. security. ProtectionDomain getProtectionDomain( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean desiredAssertionStatus( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEnum( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T [] getEnumConstants( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T cast(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> Class<? extends U> asSubclass(Class<U> clazz) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <A extends Annotation> A [] getAnnotationsByType(Class<A> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] getAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <A extends Annotation> A [] getDeclaredAnnotationsByType(Class<A> annotationClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Annotation [] getDeclaredAnnotations( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AnnotatedType getAnnotatedSuperclass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public AnnotatedType [] getAnnotatedInterfaces( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}