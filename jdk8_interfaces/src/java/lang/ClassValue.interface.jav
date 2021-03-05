package java.lang;

import java.util.WeakHashMap;
import java.lang.ref.WeakReference;

public abstract class ClassValue<T> {
  public T get(Class<?> type) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public void remove(Class<?> type) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  void put(Class<?> type, T value) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
  Entry<T> castEntry(Entry<?> e) {
                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                 }
  boolean match(Entry<?> e) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  final int hashCodeForCache;
  static final int HASH_MASK;
  static class Identity {
  }
  final Identity identity;
  Version<T> version( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
  void bumpVersion( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  static class Version<T> {
    Version(ClassValue<T> classValue) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    ClassValue<T> classValue( ) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
    Entry<T> promise( ) {
                          throw new java . lang . RuntimeException ("Implementation stripped");
                        }
    boolean isLive( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
  }
  static class Entry<T> extends WeakReference<Version<T>> {
    final Object value;
    Entry(Version<T> version, T value) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Entry(Version<T> version) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    T value( ) {
                 throw new java . lang . RuntimeException ("Implementation stripped");
               }
    boolean isPromise( ) {
                           throw new java . lang . RuntimeException ("Implementation stripped");
                         }
    Version<T> version( ) {
                            throw new java . lang . RuntimeException ("Implementation stripped");
                          }
    ClassValue<T> classValueOrNull( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    boolean isLive( ) {
                        throw new java . lang . RuntimeException ("Implementation stripped");
                      }
    Entry<T> refreshVersion(Version<T> v2) {
                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                           }
    static final Entry<?> DEAD_ENTRY;
  }
  static <T> Entry<T> makeEntry(Version<T> explicitVersion, T value) {
                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                     }
  static class ClassValueMap extends WeakHashMap<ClassValue. Identity, Entry<?>> {
    ClassValueMap(Class<?> type) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Entry<?> [] getCache( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
    synchronized <T> Entry<T> startEntry(ClassValue<T> classValue) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
    synchronized <T> Entry<T> finishEntry(ClassValue<T> classValue, Entry<T> e) {
                                                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                }
    synchronized void removeEntry(ClassValue<?> classValue) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    synchronized <T> void changeEntry(ClassValue<T> classValue, T value) {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
    static Entry<?> loadFromCache(Entry<?> [] cache, int i) {
                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                            }
    static <T> Entry<T> probeHomeLocation(Entry<?> [] cache, ClassValue<T> classValue) {
                                                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                       }
    static <T> Entry<T> probeBackupLocations(Entry<?> [] cache, ClassValue<T> classValue) {
                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                          }
  }
}