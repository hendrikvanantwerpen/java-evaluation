package java.lang.invoke;

import java.util.*;
import sun.invoke.util.*;

public abstract class MethodHandle {
  public MethodType type( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  MethodHandle(MethodType type, LambdaForm form) {
  }
  public final native Object invokeExact(Object ... args) throws Throwable ;
  public final native Object invoke(Object ... args) throws Throwable ;
  public Object invokeWithArguments(Object ... arguments) throws Throwable {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object invokeWithArguments(java. util. List<?> arguments) throws Throwable {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodHandle asType(MethodType newType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodHandle asSpreader(Class<?> arrayType, int arrayLength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodHandle asCollector(Class<?> arrayType, int arrayLength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodHandle asVarargsCollector(Class<?> arrayType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isVarargsCollector( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodHandle asFixedArity( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MethodHandle bindTo(Object x) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}