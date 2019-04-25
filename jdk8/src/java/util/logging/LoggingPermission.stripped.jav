package java.util.logging;

import java.security.*;

public final class LoggingPermission extends java. security. BasicPermission {
  public LoggingPermission(String name, String actions) throws IllegalArgumentException{
    super(name);
  }
}