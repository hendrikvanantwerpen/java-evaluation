package java.sql;

import java.security.*;

public final class SQLPermission extends BasicPermission {
  public SQLPermission(String name) {
    super(name);
  }
  public SQLPermission(String name, String actions) {
    super(name, actions);
  }
}