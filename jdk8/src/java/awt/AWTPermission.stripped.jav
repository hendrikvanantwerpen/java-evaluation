package java.awt;

import java.security.BasicPermission;

public final class AWTPermission extends BasicPermission {
  public AWTPermission(String name) {
    super(name);
  }
  public AWTPermission(String name, String actions) {
    super(name, actions);
  }
}