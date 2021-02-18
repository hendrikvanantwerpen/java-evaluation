package java.lang.ref;


public class ReferenceQueue<T> {
  private static class Null<S> extends ReferenceQueue<S> {
  }
  static private class Lock {
  }
}