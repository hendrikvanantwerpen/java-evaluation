package java.lang;

import java.lang.ref.*;

public class InheritableThreadLocal<T> extends ThreadLocal<T> {
  protected T childValue(T parentValue) {
                                          throw new java . lang . RuntimeException ("Implementation stripped");
                                        }
  ThreadLocalMap getMap(Thread t) {
                                    throw new java . lang . RuntimeException ("Implementation stripped");
                                  }
  void createMap(Thread t, T firstValue) {
                                           throw new java . lang . RuntimeException ("Implementation stripped");
                                         }
}