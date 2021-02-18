package java.util.concurrent.locks;


public class ReentrantLock implements Lock, java. io. Serializable {
  abstract static class Sync extends AbstractQueuedSynchronizer {
  }
  static final class NonfairSync extends Sync {
  }
  static final class FairSync extends Sync {
  }
}