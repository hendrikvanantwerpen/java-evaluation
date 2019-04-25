package java.util.prefs;


public class PreferenceChangeEvent extends java. util. EventObject {
  public PreferenceChangeEvent(Preferences node,String key, String newValue) {
    super(node);
  }
  public Preferences getNode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getKey( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getNewValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}