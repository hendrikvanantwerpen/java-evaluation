package java.lang.management;


public final class ManagementPermission extends java. security. BasicPermission {
  public ManagementPermission(String name) {
    super(name);
  }
  public ManagementPermission(String name, String actions) throws IllegalArgumentException{
    super(name);
  }
}