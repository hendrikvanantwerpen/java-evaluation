package java.lang.invoke;

import java.util.List;

public final class MethodType implements java. io. Serializable {
  private MethodType(Class<?> rtype,Class<?> [] ptypes, boolean trusted) {
  }
  private MethodType(Class<?> [] ptypes, Class<?> rtype) {
  }
  public static MethodType methodType(Class<?> rtype, Class<?> [] ptypes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType methodType(Class<?> rtype, List<Class<?>> ptypes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType methodType(Class<?> rtype,Class<?> ptype0, Class<?> ... ptypes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType methodType(Class<?> rtype) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType methodType(Class<?> rtype, Class<?> ptype0) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType methodType(Class<?> rtype, MethodType ptypes) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType genericMethodType(int objectArgCount, boolean finalArray) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType genericMethodType(int objectArgCount) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType changeParameterType(int num, Class<?> nptype) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType insertParameterTypes(int num, Class<?> ... ptypesToInsert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType appendParameterTypes(Class<?> ... ptypesToInsert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType insertParameterTypes(int num, List<Class<?>> ptypesToInsert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType appendParameterTypes(List<Class<?>> ptypesToInsert) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType dropParameterTypes(int start, int end) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType changeReturnType(Class<?> nrtype) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasPrimitives( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean hasWrappers( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType erase( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType generic( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType wrap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodType unwrap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> parameterType(int num) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int parameterCount( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> returnType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public List<Class<?>> parameterList( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> [] parameterArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static MethodType fromMethodDescriptorString(String descriptor, ClassLoader loader) throws IllegalArgumentException, TypeNotPresentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toMethodDescriptorString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private MethodType( ) {
  }
}