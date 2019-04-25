package java.rmi.server;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;

public final class UID implements Serializable {
  public UID( ) {
  }
  public UID(short num) {
  }
  private UID(int unique,long time, short count) {
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
  public void write(DataOutput out) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static UID read(DataInput in) throws IOException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}