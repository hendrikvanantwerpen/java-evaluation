package java.rmi.activation;

import java.io.Serializable;
import java.rmi.MarshalledObject;

public final class ActivationDesc implements Serializable {
  public ActivationDesc(String className,String location, MarshalledObject<?> data) throws ActivationException{
    this(ActivationGroup. internalCurrentGroupID( ), className, location, data, false);
  }
  public ActivationDesc(String className,String location,MarshalledObject<?> data, boolean restart) throws ActivationException{
    this(ActivationGroup. internalCurrentGroupID( ), className, location, data, restart);
  }
  public ActivationDesc(ActivationGroupID groupID,String className,String location, MarshalledObject<?> data) {
    this(groupID, className, location, data, false);
  }
  public ActivationDesc(ActivationGroupID groupID,String className,String location,MarshalledObject<?> data, boolean restart) {
  }
  public ActivationGroupID getGroupID( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getClassName( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String getLocation( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public MarshalledObject<?> getData( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean getRestartMode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}