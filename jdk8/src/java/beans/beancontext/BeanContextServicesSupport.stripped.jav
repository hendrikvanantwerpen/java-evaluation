package java.beans.beancontext;

import java.util.Iterator;
import java.util.TooManyListenersException;
import java.util.Locale;

public class BeanContextServicesSupport extends BeanContextSupport implements BeanContextServices {
  public BeanContextServicesSupport(BeanContextServices peer,Locale lcle,boolean dTime, boolean visible) {
    super(peer, lcle, dTime, visible);
  }
  public BeanContextServicesSupport(BeanContextServices peer,Locale lcle, boolean dtime) {
    this(peer, lcle, dtime, true);
  }
  public BeanContextServicesSupport(BeanContextServices peer, Locale lcle) {
    this(peer, lcle, false, true);
  }
  public BeanContextServicesSupport(BeanContextServices peer) {
    this(peer, null, false, true);
  }
  public BeanContextServicesSupport( ) {
    this(null, null, false, true);
  }
  public void initialize( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public BeanContextServices getBeanContextServicesPeer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addBeanContextServicesListener(BeanContextServicesListener bcsl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeBeanContextServicesListener(BeanContextServicesListener bcsl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addService(Class serviceClass, BeanContextServiceProvider bcsp) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void revokeService(Class serviceClass,BeanContextServiceProvider bcsp, boolean revokeCurrentServicesNow) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean hasService(Class serviceClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object getService(BeanContextChild child,Object requestor,Class serviceClass,Object serviceSelector, BeanContextServiceRevokedListener bcsrl) throws TooManyListenersException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void releaseService(BeanContextChild child,Object requestor, Object service) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator getCurrentServiceClasses( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator getCurrentServiceSelectors(Class serviceClass) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void serviceAvailable(BeanContextServiceAvailableEvent bcssae) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void serviceRevoked(BeanContextServiceRevokedEvent bcssre) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}