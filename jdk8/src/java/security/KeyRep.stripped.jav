package java.security;

import java.io.*;

public class KeyRep implements Serializable {
  public static enum Type {
    SECRET, PUBLIC, PRIVATE,
  }
  public KeyRep(Type type,String algorithm,String format, byte [] encoded) {
  }
}