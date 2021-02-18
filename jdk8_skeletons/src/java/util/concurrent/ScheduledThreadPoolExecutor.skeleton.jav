package java.util.concurrent;

import java.util.*;

public class ScheduledThreadPoolExecutor extends ThreadPoolExecutor implements ScheduledExecutorService {
  private class ScheduledFutureTask<V> extends FutureTask<V> implements RunnableScheduledFuture<V> {
  }
  static class DelayedWorkQueue extends AbstractQueue<Runnable> implements BlockingQueue<Runnable> {
    private class Itr implements Iterator<Runnable> {
    }
  }
}