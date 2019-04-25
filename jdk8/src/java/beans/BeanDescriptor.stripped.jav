package java.beans;


public class BeanDescriptor extends FeatureDescriptor {
  public BeanDescriptor(Class<?> beanClass) {
    this(beanClass, null);
  }
  public BeanDescriptor(Class<?> beanClass, Class<?> customizerClass) {
  }
  public Class<?> getBeanClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class<?> getCustomizerClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  BeanDescriptor(BeanDescriptor old) {
    super(old);
  }
}