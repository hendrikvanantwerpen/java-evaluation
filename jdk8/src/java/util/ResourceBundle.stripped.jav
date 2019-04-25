package java.util;

import java.io.IOException;

public abstract class ResourceBundle {
  public String getBaseBundleName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public ResourceBundle( ) {
  }
  public final String getString(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String [] getStringArray(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final Object getObject(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Locale getLocale( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final ResourceBundle getBundle(String baseName) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final ResourceBundle getBundle(String baseName, Control control) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final ResourceBundle getBundle(String baseName, Locale locale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final ResourceBundle getBundle(String baseName,Locale targetLocale, Control control) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ResourceBundle getBundle(String baseName,Locale locale, ClassLoader loader) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ResourceBundle getBundle(String baseName,Locale targetLocale,ClassLoader loader, Control control) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final void clearCache( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static final void clearCache(ClassLoader loader) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract Enumeration<String> getKeys( ) ;
  public boolean containsKey(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Set<String> keySet( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class Control {
    public static final List<String> FORMAT_DEFAULT;
    public static final List<String> FORMAT_CLASS;
    public static final List<String> FORMAT_PROPERTIES;
    public static final long TTL_DONT_CACHE;
    public static final long TTL_NO_EXPIRATION_CONTROL;
    protected Control( ) {
    }
    public static final Control getControl(List<String> formats) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public static final Control getNoFallbackControl(List<String> formats) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public List<String> getFormats(String baseName) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public List<Locale> getCandidateLocales(String baseName, Locale locale) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public Locale getFallbackLocale(String baseName, Locale locale) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public ResourceBundle newBundle(String baseName,Locale locale,String format,ClassLoader loader, boolean reload) throws IllegalAccessException, InstantiationException, IOException {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public long getTimeToLive(String baseName, Locale locale) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean needsReload(String baseName,Locale locale,String format,ClassLoader loader,ResourceBundle bundle, long loadTime) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String toBundleName(String baseName, Locale locale) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public final String toResourceName(String bundleName, String suffix) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
}