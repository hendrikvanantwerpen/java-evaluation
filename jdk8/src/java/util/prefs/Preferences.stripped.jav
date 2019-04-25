package java.util.prefs;

import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;

public abstract class Preferences {
  public static final int MAX_KEY_LENGTH;
  public static final int MAX_VALUE_LENGTH;
  public static final int MAX_NAME_LENGTH;
  public static Preferences userNodeForPackage(Class<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Preferences systemNodeForPackage(Class<?> c) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Preferences userRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static Preferences systemRoot( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  protected Preferences( ) {
  }
  public abstract void put(String key, String value) ;
  public abstract String get(String key, String def) ;
  public abstract void remove(String key) ;
  public abstract void clear( ) throws BackingStoreException ;
  public abstract void putInt(String key, int value) ;
  public abstract int getInt(String key, int def) ;
  public abstract void putLong(String key, long value) ;
  public abstract long getLong(String key, long def) ;
  public abstract void putBoolean(String key, boolean value) ;
  public abstract boolean getBoolean(String key, boolean def) ;
  public abstract void putFloat(String key, float value) ;
  public abstract float getFloat(String key, float def) ;
  public abstract void putDouble(String key, double value) ;
  public abstract double getDouble(String key, double def) ;
  public abstract void putByteArray(String key, byte [] value) ;
  public abstract byte [] getByteArray(String key, byte [] def) ;
  public abstract String [] keys( ) throws BackingStoreException ;
  public abstract String [] childrenNames( ) throws BackingStoreException ;
  public abstract Preferences parent( ) ;
  public abstract Preferences node(String pathName) ;
  public abstract boolean nodeExists(String pathName) throws BackingStoreException ;
  public abstract void removeNode( ) throws BackingStoreException ;
  public abstract String name( ) ;
  public abstract String absolutePath( ) ;
  public abstract boolean isUserNode( ) ;
  public abstract String toString( ) ;
  public abstract void flush( ) throws BackingStoreException ;
  public abstract void sync( ) throws BackingStoreException ;
  public abstract void addPreferenceChangeListener(PreferenceChangeListener pcl) ;
  public abstract void removePreferenceChangeListener(PreferenceChangeListener pcl) ;
  public abstract void addNodeChangeListener(NodeChangeListener ncl) ;
  public abstract void removeNodeChangeListener(NodeChangeListener ncl) ;
  public abstract void exportNode(OutputStream os) throws IOException, BackingStoreException ;
  public abstract void exportSubtree(OutputStream os) throws IOException, BackingStoreException ;
  public static void importPreferences(InputStream is) throws IOException, InvalidPreferencesFormatException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}