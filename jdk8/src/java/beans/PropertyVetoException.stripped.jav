package java.beans;


public class PropertyVetoException extends Exception {
  public PropertyVetoException(String mess, PropertyChangeEvent evt) {
    super(mess);
  }
  public PropertyChangeEvent getPropertyChangeEvent( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}