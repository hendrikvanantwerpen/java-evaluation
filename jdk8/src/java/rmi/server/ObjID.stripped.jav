package java.rmi.server;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public final class ObjID implements Serializable {
  public static final int REGISTRY_ID;
  public static final int ACTIVATOR_ID;
  public static final int DGC_ID;
  public ObjID( ) {
  }
  public ObjID(int objNum) {
  }
  private ObjID(long objNum, UID space) {
  }
  public void write(ObjectOutput out) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static ObjID read(ObjectInput in) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}