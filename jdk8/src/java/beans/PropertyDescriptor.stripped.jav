package java.beans;

import java.lang.reflect.Method;

public class PropertyDescriptor extends FeatureDescriptor {
  public PropertyDescriptor(String propertyName, Class<?> beanClass) throws IntrospectionException{
    this(propertyName, beanClass, Introspector.IS_PREFIX + NameGenerator. capitalize(propertyName), Introspector.SET_PREFIX + NameGenerator. capitalize(propertyName));
  }
  public PropertyDescriptor(String propertyName,Class<?> beanClass,String readMethodName, String writeMethodName) throws IntrospectionException{
  }
  public PropertyDescriptor(String propertyName,Method readMethod, Method writeMethod) throws IntrospectionException{
  }
  PropertyDescriptor(Class<?> bean,String base,Method read, Method write) throws IntrospectionException{
  }
  public synchronized Class<?> getPropertyType( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method getReadMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setReadMethod(Method readMethod) throws IntrospectionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Method getWriteMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setWriteMethod(Method writeMethod) throws IntrospectionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isBound( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setBound(boolean bound) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isConstrained( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setConstrained(boolean constrained) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void setPropertyEditorClass(Class<?> propertyEditorClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> getPropertyEditorClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public PropertyEditor createPropertyEditor(Object bean) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  PropertyDescriptor(PropertyDescriptor x, PropertyDescriptor y) {
    super(x, y);
  }
  PropertyDescriptor(PropertyDescriptor old) {
    super(old);
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}