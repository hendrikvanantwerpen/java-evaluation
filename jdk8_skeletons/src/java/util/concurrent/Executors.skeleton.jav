package java.util.concurrent;

import java.util.*;

public class Executors {
  static final class RunnableAdapter<T> implements Callable<T> {
  }
  static final class PrivilegedCallable<T> implements Callable<T> {
  }
  static final class PrivilegedCallableUsingCurrentClassLoader<T> implements Callable<T> {
  }
  static class DefaultThreadFactory implements ThreadFactory {
  }
  static class PrivilegedThreadFactory extends DefaultThreadFactory {
  }
  static class DelegatedExecutorService extends AbstractExecutorService {
  }
  static class FinalizableDelegatedExecutorService extends DelegatedExecutorService {
  }
  static class DelegatedScheduledExecutorService extends DelegatedExecutorService implements ScheduledExecutorService {
  }
}