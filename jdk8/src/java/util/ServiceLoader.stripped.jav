package java.util;

import java.util.Iterator;

public final class ServiceLoader<S> implements Iterable<S> {
  public void reload( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private ServiceLoader(Class<S> svc, ClassLoader cl) {
  }
  public Iterator<S> iterator( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <S> ServiceLoader<S> load(Class<S> service, ClassLoader loader) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <S> ServiceLoader<S> load(Class<S> service) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <S> ServiceLoader<S> loadInstalled(Class<S> service) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}