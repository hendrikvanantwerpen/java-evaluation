package java.rmi.activation;

import java.io.Serializable;
import java.rmi.MarshalledObject;
import java.util.Properties;

public final class ActivationGroupDesc implements Serializable {
  public ActivationGroupDesc(Properties overrides, CommandEnvironment cmd) {
    this(null, null, null, overrides, cmd);
  }
  public ActivationGroupDesc(String className,String location,MarshalledObject<?> data,Properties overrides, CommandEnvironment cmd) {
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
  public Properties getPropertyOverrides( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CommandEnvironment getCommandEnvironment( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static class CommandEnvironment implements Serializable {
    public CommandEnvironment(String cmdpath, String [] argv) {
    }
    public String getCommandPath( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public String [] getCommandOptions( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public boolean equals(Object obj) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
    public int hashCode( ) {
      throw new java . lang . RuntimeException ("Implementation stripped");
    }
  }
  public boolean equals(Object obj) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int hashCode( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}