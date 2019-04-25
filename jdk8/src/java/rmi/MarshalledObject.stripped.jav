package java.rmi;

import java.io.IOException;
import java.io.Serializable;

public final class MarshalledObject<T> implements Serializable {
  public MarshalledObject(T obj) throws IOException{
  }
  public T get( ) throws IOException, ClassNotFoundException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}