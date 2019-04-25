package java.awt.datatransfer;

import java.util.List;
import java.util.Map;

public final class SystemFlavorMap implements FlavorMap, FlavorTable {
  public static FlavorMap getDefaultFlavorMap( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  private SystemFlavorMap( ) {
  }
  public synchronized List<String> getNativesForFlavor(DataFlavor flav) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized List<DataFlavor> getFlavorsForNative(String nat) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Map<DataFlavor, String> getNativesForFlavors(DataFlavor [] flavors) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized Map<String, DataFlavor> getFlavorsForNatives(String [] natives) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addUnencodedNativeForFlavor(DataFlavor flav, String nat) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setNativesForFlavor(DataFlavor flav, String [] natives) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void addFlavorForUnencodedNative(String nat, DataFlavor flav) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public synchronized void setFlavorsForNative(String nat, DataFlavor [] flavors) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String encodeJavaMIMEType(String mimeType) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String encodeDataFlavor(DataFlavor flav) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static boolean isJavaMIMEType(String str) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static String decodeJavaMIMEType(String nat) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static DataFlavor decodeDataFlavor(String nat) throws ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}