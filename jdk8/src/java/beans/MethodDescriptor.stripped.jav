package java.beans;

import java.lang.reflect.Method;

public class MethodDescriptor extends FeatureDescriptor {
  public MethodDescriptor(Method method) {
    this(method, null);
  }
  public MethodDescriptor(Method method, ParameterDescriptor parameterDescriptors[]) {
  }
  public synchronized Method getMethod( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ParameterDescriptor [] getParameterDescriptors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  MethodDescriptor(MethodDescriptor x, MethodDescriptor y) {
    super(x, y);
  }
  MethodDescriptor(MethodDescriptor old) {
    super(old);
  }
}