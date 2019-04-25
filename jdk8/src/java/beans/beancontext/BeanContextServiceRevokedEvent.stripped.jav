package java.beans.beancontext;

import java.beans.beancontext.BeanContextEvent;
import java.beans.beancontext.BeanContextServices;

public class BeanContextServiceRevokedEvent extends BeanContextEvent {
  public BeanContextServiceRevokedEvent(BeanContextServices bcs,Class sc, boolean invalidate) {
    super((BeanContext ) bcs);
  }
  public BeanContextServices getSourceAsBeanContextServices( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Class getServiceClass( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isServiceClass(Class service) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCurrentServiceInvalidNow( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}