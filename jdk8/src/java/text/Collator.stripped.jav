package java.text;

import java.util.Locale;

public abstract class Collator implements java. util. Comparator<Object>, Cloneable {
  public final static int PRIMARY;
  public final static int SECONDARY;
  public final static int TERTIARY;
  public final static int IDENTICAL;
  public final static int NO_DECOMPOSITION;
  public final static int CANONICAL_DECOMPOSITION;
  public final static int FULL_DECOMPOSITION;
  public static synchronized Collator getInstance( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Collator getInstance(Locale desiredLocale) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract int compare(String source, String target) ;
  public int compare(Object o1, Object o2) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public abstract CollationKey getCollationKey(String source) ;
  public boolean equals(String source, String target) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getStrength( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setStrength(int newStrength) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized int getDecomposition( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setDecomposition(int decompositionMode) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized Locale [] getAvailableLocales( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Object clone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object that) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public int hashCode( ) ;
  protected Collator( ) {
  }
}