package java.security;

import java.lang.reflect.*;
import java.util.*;
import java.io.*;
import sun.security.jca.*;

public final class Security {
  private Security( ) {
  }
  public static String getAlgorithmProperty(String algName, String propName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized int insertProviderAt(Provider provider, int position) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static int addProvider(Provider provider) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized void removeProvider(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Provider [] getProviders( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Provider getProvider(String name) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Provider [] getProviders(String filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Provider [] getProviders(Map<String, String> filter) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String getProperty(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static void setProperty(String key, String datum) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Set<String> getAlgorithms(String serviceName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}