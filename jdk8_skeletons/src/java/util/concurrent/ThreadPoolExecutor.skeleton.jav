package java.util.concurrent;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.*;

public class ThreadPoolExecutor extends AbstractExecutorService {
  private final class Worker extends AbstractQueuedSynchronizer implements Runnable {
  }
  public static class CallerRunsPolicy implements RejectedExecutionHandler {
  }
  public static class AbortPolicy implements RejectedExecutionHandler {
  }
  public static class DiscardPolicy implements RejectedExecutionHandler {
  }
  public static class DiscardOldestPolicy implements RejectedExecutionHandler {
  }
}