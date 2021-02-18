package java.util.concurrent.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class StampedLock implements java. io. Serializable {
  static final class WNode {
  }
  final class ReadLockView implements Lock {
  }
  final class WriteLockView implements Lock {
  }
  final class ReadWriteLockView implements ReadWriteLock {
  }
}