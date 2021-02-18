package java.security;

import java.util.*;
import java.lang.*;
import sun.security.util.MessageDigestSpi2;

public abstract class MessageDigest extends MessageDigestSpi {
  static class Delegate extends MessageDigest implements MessageDigestSpi2 {
  }
}