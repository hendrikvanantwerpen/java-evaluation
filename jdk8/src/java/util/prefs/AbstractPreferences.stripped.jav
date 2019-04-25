package java.util.prefs;

import java.util.*;
import java.io.*;

public abstract class AbstractPreferences extends Preferences {
  protected AbstractPreferences(AbstractPreferences parent, String name) {
  }
  public void put(String key, String value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String get(String key, String def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void remove(String key) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void clear( ) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putInt(String key, int value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getInt(String key, int def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putLong(String key, long value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public long getLong(String key, long def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putBoolean(String key, boolean value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getBoolean(String key, boolean def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putFloat(String key, float value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public float getFloat(String key, float def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putDouble(String key, double value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public double getDouble(String key, double def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void putByteArray(String key, byte [] value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public byte [] getByteArray(String key, byte [] def) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] keys( ) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String [] childrenNames( ) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Preferences parent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Preferences node(String path) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean nodeExists(String path) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNode( ) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String name( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String absolutePath( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isUserNode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addPreferenceChangeListener(PreferenceChangeListener pcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removePreferenceChangeListener(PreferenceChangeListener pcl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void addNodeChangeListener(NodeChangeListener ncl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void removeNodeChangeListener(NodeChangeListener ncl) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void sync( ) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void flush( ) throws BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void exportNode(OutputStream os) throws IOException, BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void exportSubtree(OutputStream os) throws IOException, BackingStoreException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}