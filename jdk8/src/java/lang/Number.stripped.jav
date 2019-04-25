package java.lang;


public abstract class Number implements java. io. Serializable {
  public abstract int intValue( ) ;
  public abstract long longValue( ) ;
  public abstract float floatValue( ) ;
  public abstract double doubleValue( ) ;
  public byte byteValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public short shortValue( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}