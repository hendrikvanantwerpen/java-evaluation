package java.lang.ref;


public abstract class Reference<T> {
  static private class Lock {
  }
  private static class ReferenceHandler extends Thread {
  }
}