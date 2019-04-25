package java.util.prefs;


public class NodeChangeEvent extends java. util. EventObject {
  public NodeChangeEvent(Preferences parent, Preferences child) {
    super(parent);
  }
  public Preferences getParent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public Preferences getChild( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}