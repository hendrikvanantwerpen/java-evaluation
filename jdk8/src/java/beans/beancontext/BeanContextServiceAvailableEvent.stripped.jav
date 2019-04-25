package java.beans.beancontext;

import java.beans.beancontext.BeanContextEvent;
import java.beans.beancontext.BeanContextServices;
import java.util.Iterator;

public class BeanContextServiceAvailableEvent extends BeanContextEvent {
  public BeanContextServiceAvailableEvent(BeanContextServices bcs, Class sc) {
    super((BeanContext ) bcs);
  }
  public BeanContextServices getSourceAsBeanContextServices( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class getServiceClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator getCurrentServiceSelectors( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}