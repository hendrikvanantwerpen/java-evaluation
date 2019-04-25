package java.beans;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EventHandler implements InvocationHandler {
  @ConstructorProperties({"target","action","eventPropertyName","listenerMethodName"}) public EventHandler(Object target,String action,String eventPropertyName, String listenerMethodName) {
  }
  public Object getTarget( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getAction( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getEventPropertyName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getListenerMethodName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object invoke(final Object proxy,final Method method, final Object [] arguments) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T create(Class<T> listenerInterface,Object target, String action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T create(Class<T> listenerInterface,Object target,String action, String eventPropertyName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <T> T create(Class<T> listenerInterface,Object target,String action,String eventPropertyName, String listenerMethodName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}