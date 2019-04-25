package java.net;

import java.security.*;

public final class NetPermission extends BasicPermission {
  public NetPermission(String name) {
    super(name);
  }
  public NetPermission(String name, String actions) {
    super(name, actions);
  }
}