package java.security;


public class GuardedObject implements java. io. Serializable {
  public GuardedObject(Object object, Guard guard) {
  }
  public Object getObject( ) throws SecurityException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}