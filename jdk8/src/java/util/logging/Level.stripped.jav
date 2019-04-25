package java.util.logging;


public class Level implements java. io. Serializable {
  public static final Level OFF;
  public static final Level SEVERE;
  public static final Level WARNING;
  public static final Level INFO;
  public static final Level CONFIG;
  public static final Level FINE;
  public static final Level FINER;
  public static final Level FINEST;
  public static final Level ALL;
  protected Level(String name, int value) {
    this(name, value, null);
  }
  protected Level(String name,int value, String resourceBundleName) {
    this(name, value, resourceBundleName, true);
  }
  private Level(String name,int value,String resourceBundleName, boolean visible) {
  }
  public String getResourceBundleName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLocalizedName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public final int intValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static synchronized Level parse(String name) throws IllegalArgumentException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object ox) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}