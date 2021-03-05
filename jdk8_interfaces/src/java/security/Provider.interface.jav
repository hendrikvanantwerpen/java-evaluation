package java.security;

import java.io.*;
import java.util.*;
import java.lang.ref.*;
import java.lang.reflect.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public abstract class Provider extends Properties {
  static final long serialVersionUID;
  public String getName( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public double getVersion( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  public String getInfo( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
  public String toString( ) {
                              throw new java . lang . RuntimeException ("Implementation stripped");
                            }
  public synchronized void clear( ) {
                                      throw new java . lang . RuntimeException ("Implementation stripped");
                                    }
  public synchronized void load(InputStream inStream) throws IOException {
                                                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                                                         }
  public synchronized void putAll(Map<?, ?> t) {
                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                               }
  public synchronized Set<Map. Entry<Object, Object>> entrySet( ) {
                                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                                  }
  public Set<Object> keySet( ) {
                                 throw new java . lang . RuntimeException ("Implementation stripped");
                               }
  public Collection<Object> values( ) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
  public synchronized Object put(Object key, Object value) {
                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                           }
  public synchronized Object putIfAbsent(Object key, Object value) {
                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                   }
  public synchronized Object remove(Object key) {
                                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                                }
  public synchronized boolean remove(Object key, Object value) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public synchronized boolean replace(Object key,Object oldValue, Object newValue) {
                                                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                   }
  public synchronized Object replace(Object key, Object value) {
                                                                 throw new java . lang . RuntimeException ("Implementation stripped");
                                                               }
  public synchronized void replaceAll(BiFunction<? super Object, ? super Object, ? extends Object> function) {
                                                                                                               throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                             }
  public synchronized Object compute(Object key, BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) {
                                                                                                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                 }
  public synchronized Object computeIfAbsent(Object key, Function<? super Object, ? extends Object> mappingFunction) {
                                                                                                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                     }
  public synchronized Object computeIfPresent(Object key, BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) {
                                                                                                                                            throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                          }
  public synchronized Object merge(Object key,Object value, BiFunction<? super Object, ? super Object, ? extends Object> remappingFunction) {
                                                                                                                                              throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                                                                            }
  public Object get(Object key) {
                                  throw new java . lang . RuntimeException ("Implementation stripped");
                                }
  public synchronized Object getOrDefault(Object key, Object defaultValue) {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  public synchronized void forEach(BiConsumer<? super Object, ? super Object> action) {
                                                                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                      }
  public Enumeration<Object> keys( ) {
                                       throw new java . lang . RuntimeException ("Implementation stripped");
                                     }
  public Enumeration<Object> elements( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
  public String getProperty(String key) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  private static class ServiceKey {
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    boolean matches(String type, String algorithm) {
                                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                                   }
  }
  public synchronized Service getService(String type, String algorithm) {
                                                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                                                        }
  public synchronized Set<Service> getServices( ) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
  private static class UString {
    final String string;
    final String lowerString;
    UString(String s) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
                             throw new java . lang . RuntimeException ("Implementation stripped");
                           }
    public boolean equals(Object obj) {
                                        throw new java . lang . RuntimeException ("Implementation stripped");
                                      }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
  private static class EngineDescription {
    final String name;
    final boolean supportsParameter;
    final String constructorParameterClassName;
    EngineDescription(String name,boolean sp, String paramName) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    Class<?> getConstructorParameterClass( ) throws ClassNotFoundException {
                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                           }
  }
  public static class Service {
    void addAttribute(String type, String value) {
                                                   throw new java . lang . RuntimeException ("Implementation stripped");
                                                 }
    public Service(Provider provider,String type,String algorithm,String className,List<String> aliases, Map<String, String> attributes) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final String getType( ) {
                                     throw new java . lang . RuntimeException ("Implementation stripped");
                                   }
    public final String getAlgorithm( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final Provider getProvider( ) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
    public final String getClassName( ) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
    public final String getAttribute(String name) {
                                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                                  }
    public Object newInstance(Object constructorParameter) throws NoSuchAlgorithmException {
                                                                                             throw new java . lang . RuntimeException ("Implementation stripped");
                                                                                           }
    public boolean supportsParameter(Object parameter) {
                                                         throw new java . lang . RuntimeException ("Implementation stripped");
                                                       }
    public String toString( ) {
                                throw new java . lang . RuntimeException ("Implementation stripped");
                              }
  }
}