package java.beans.beancontext;

import java.util.EventObject;
import java.beans.beancontext.BeanContext;

public abstract class BeanContextEvent extends EventObject {
  protected BeanContextEvent(BeanContext bc) {
    super(bc);
  }
  public BeanContext getBeanContext( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setPropagatedFrom(BeanContext bc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized BeanContext getPropagatedFrom( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean isPropagated( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}