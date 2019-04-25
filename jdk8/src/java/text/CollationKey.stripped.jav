package java.text;


public abstract class CollationKey implements Comparable<CollationKey> {
  abstract public int compareTo(CollationKey target) ;
  public String getSourceString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  abstract public byte [] toByteArray( ) ;
  protected CollationKey(String source) {
  }
}