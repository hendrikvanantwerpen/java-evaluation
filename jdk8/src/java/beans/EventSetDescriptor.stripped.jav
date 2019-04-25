package java.beans;

import java.lang.reflect.Method;

public class EventSetDescriptor extends FeatureDescriptor {
  public EventSetDescriptor(Class<?> sourceClass,String eventSetName,Class<?> listenerType, String listenerMethodName) throws IntrospectionException{
    this(sourceClass, eventSetName, listenerType, new String[]{listenerMethodName}, Introspector.ADD_PREFIX + getListenerClassName(listenerType), Introspector.REMOVE_PREFIX + getListenerClassName(listenerType), Introspector.GET_PREFIX + getListenerClassName(listenerType) + "s");
  }
  public EventSetDescriptor(Class<?> sourceClass,String eventSetName,Class<?> listenerType,String listenerMethodNames[],String addListenerMethodName, String removeListenerMethodName) throws IntrospectionException{
    this(sourceClass, eventSetName, listenerType, listenerMethodNames, addListenerMethodName, removeListenerMethodName, null);
  }
  public EventSetDescriptor(Class<?> sourceClass,String eventSetName,Class<?> listenerType,String listenerMethodNames[],String addListenerMethodName,String removeListenerMethodName, String getListenerMethodName) throws IntrospectionException{
  }
  public EventSetDescriptor(String eventSetName,Class<?> listenerType,Method listenerMethods[],Method addListenerMethod, Method removeListenerMethod) throws IntrospectionException{
    this(eventSetName, listenerType, listenerMethods, addListenerMethod, removeListenerMethod, null);
  }
  public EventSetDescriptor(String eventSetName,Class<?> listenerType,Method listenerMethods[],Method addListenerMethod,Method removeListenerMethod, Method getListenerMethod) throws IntrospectionException{
  }
  public EventSetDescriptor(String eventSetName,Class<?> listenerType,MethodDescriptor listenerMethodDescriptors[],Method addListenerMethod, Method removeListenerMethod) throws IntrospectionException{
  }
  public Class<?> getListenerType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method [] getListenerMethods( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized MethodDescriptor [] getListenerMethodDescriptors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method getAddListenerMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method getRemoveListenerMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method getGetListenerMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setUnicast(boolean unicast) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUnicast( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setInDefaultEventSet(boolean inDefaultEventSet) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isInDefaultEventSet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  EventSetDescriptor(EventSetDescriptor x, EventSetDescriptor y) {
    super(x, y);
  }
  EventSetDescriptor(EventSetDescriptor old) {
    super(old);
  }
}