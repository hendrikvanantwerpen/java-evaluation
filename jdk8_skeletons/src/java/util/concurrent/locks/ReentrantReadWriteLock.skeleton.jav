package java.util.concurrent.locks;


public class ReentrantReadWriteLock implements ReadWriteLock, java. io. Serializable {
  abstract static class Sync extends AbstractQueuedSynchronizer {
    static final class HoldCounter {
    }
    static final class ThreadLocalHoldCounter extends ThreadLocal<HoldCounter> {
    }
  }
  static final class NonfairSync extends Sync {
  }
  static final class FairSync extends Sync {
  }
  public static class ReadLock implements Lock, java. io. Serializable {
  }
  public static class WriteLock implements Lock, java. io. Serializable {
  }
}