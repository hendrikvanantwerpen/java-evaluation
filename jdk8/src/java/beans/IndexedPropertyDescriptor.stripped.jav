package java.beans;

import java.lang.reflect.Method;

public class IndexedPropertyDescriptor extends PropertyDescriptor {
  public IndexedPropertyDescriptor(String propertyName, Class<?> beanClass) throws IntrospectionException{
    this(propertyName, beanClass, Introspector.GET_PREFIX + NameGenerator. capitalize(propertyName), Introspector.SET_PREFIX + NameGenerator. capitalize(propertyName), Introspector.GET_PREFIX + NameGenerator. capitalize(propertyName), Introspector.SET_PREFIX + NameGenerator. capitalize(propertyName));
  }
  public IndexedPropertyDescriptor(String propertyName,Class<?> beanClass,String readMethodName,String writeMethodName,String indexedReadMethodName, String indexedWriteMethodName) throws IntrospectionException{
    super(propertyName, beanClass, readMethodName, writeMethodName);
  }
  public IndexedPropertyDescriptor(String propertyName,Method readMethod,Method writeMethod,Method indexedReadMethod, Method indexedWriteMethod) throws IntrospectionException{
    super(propertyName, readMethod, writeMethod);
  }
  IndexedPropertyDescriptor(Class<?> bean,String base,Method read,Method write,Method readIndexed, Method writeIndexed) throws IntrospectionException{
    super(bean, base, read, write);
  }
  public synchronized Method getIndexedReadMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setIndexedReadMethod(Method readMethod) throws IntrospectionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method getIndexedWriteMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setIndexedWriteMethod(Method writeMethod) throws IntrospectionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Class<?> getIndexedPropertyType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  IndexedPropertyDescriptor(PropertyDescriptor x, PropertyDescriptor y) {
    super(x, y);
  }
  IndexedPropertyDescriptor(IndexedPropertyDescriptor old) {
    super(old);
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}