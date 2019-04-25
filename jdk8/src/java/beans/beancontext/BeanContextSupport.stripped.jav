package java.beans.beancontext;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.VetoableChangeListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class BeanContextSupport extends BeanContextChildSupport implements BeanContext, Serializable, PropertyChangeListener, VetoableChangeListener {
  public BeanContextSupport(BeanContext peer,Locale lcle,boolean dTime, boolean visible) {
    super(peer);
  }
  public BeanContextSupport(BeanContext peer,Locale lcle, boolean dtime) {
    this(peer, lcle, dtime, true);
  }
  public BeanContextSupport(BeanContext peer, Locale lcle) {
    this(peer, lcle, false, true);
  }
  public BeanContextSupport(BeanContext peer) {
    this(peer, null, false, true);
  }
  public BeanContextSupport( ) {
    this(null, null, false, true);
  }
  public BeanContext getBeanContextPeer( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object instantiateChild(String beanName) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int size( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isEmpty( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean contains(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsKey(Object o) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Iterator iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object [] toArray(Object [] arry) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean add(Object targetChild) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean remove(Object targetChild) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean containsAll(Collection c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean addAll(Collection c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean removeAll(Collection c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean retainAll(Collection c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addBeanContextMembershipListener(BeanContextMembershipListener bcml) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeBeanContextMembershipListener(BeanContextMembershipListener bcml) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public InputStream getResourceAsStream(String name, BeanContextChild bcc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public URL getResource(String name, BeanContextChild bcc) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setDesignTime(boolean dTime) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean isDesignTime( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setLocale(Locale newLocale) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized boolean needsGui( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void dontUseGui( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void okToUseGui( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean avoidingGui( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isSerializing( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void writeChildren(ObjectOutputStream oos) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final void readChildren(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void vetoableChange(PropertyChangeEvent pce) throws PropertyVetoException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void propertyChange(PropertyChangeEvent pce) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}