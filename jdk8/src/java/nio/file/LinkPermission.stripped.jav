package java.nio.file;

import java.security.BasicPermission;

public final class LinkPermission extends BasicPermission {
  public LinkPermission(String name) {
    super(name);
  }
  public LinkPermission(String name, String actions) {
    super(name);
  }
}