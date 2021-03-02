package java.beans;

import java.util.EventListener;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class ChangeListenerMap<L extends EventListener> {
  private Map<String, L []> map;
  protected abstract L [] newArray(int length) ;
  protected abstract L newProxy(String name, L listener) ;
  public final synchronized void add(String name, L listener) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public final synchronized void remove(String name, L listener) {
                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                 }
  public final synchronized L [] get(String name) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  public final void set(String name, L [] listeners) {
                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                     }
  public final synchronized L [] getListeners( ) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
  public final L [] getListeners(String name) {
                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                              }
  public final synchronized boolean hasListeners(String name) {
                                                                throw new java . lang . RuntimeException ("Implementation stripped");
                                                              }
  public final Set<Entry<String, L []>> getEntries( ) {
                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                      }
  public abstract L extract(L listener) ;
}