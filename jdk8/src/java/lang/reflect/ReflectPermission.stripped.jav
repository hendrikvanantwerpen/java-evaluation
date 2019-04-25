package java.lang.reflect;


public final class ReflectPermission extends java. security. BasicPermission {
  public ReflectPermission(String name) {
    super(name);
  }
  public ReflectPermission(String name, String actions) {
    super(name, actions);
  }
}