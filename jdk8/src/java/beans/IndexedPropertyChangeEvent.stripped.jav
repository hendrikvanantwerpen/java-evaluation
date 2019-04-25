package java.beans;


public class IndexedPropertyChangeEvent extends PropertyChangeEvent {
  public IndexedPropertyChangeEvent(Object source,String propertyName,Object oldValue,Object newValue, int index) {
    super(source, propertyName, oldValue, newValue);
  }
  public int getIndex( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}