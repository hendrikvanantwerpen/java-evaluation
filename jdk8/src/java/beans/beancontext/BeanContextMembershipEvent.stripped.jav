package java.beans.beancontext;

import java.beans.beancontext.BeanContext;
import java.beans.beancontext.BeanContextEvent;
import java.util.Collection;
import java.util.Iterator;

public class BeanContextMembershipEvent extends BeanContextEvent {
  @SuppressWarnings("rawtypes") public BeanContextMembershipEvent(BeanContext bc, Collection changes) {
    super(bc);
  }
  public BeanContextMembershipEvent(BeanContext bc, Object [] changes) {
    super(bc);
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object child) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}