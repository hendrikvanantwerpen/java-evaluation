package java.util.concurrent;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable {
  static final class ExceptionNode extends WeakReference<ForkJoinTask<?>> {
  }
  static final class AdaptedRunnable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
  }
  static final class AdaptedRunnableAction extends ForkJoinTask<Void> implements RunnableFuture<Void> {
  }
  static final class RunnableExecuteAction extends ForkJoinTask<Void> {
  }
  static final class AdaptedCallable<T> extends ForkJoinTask<T> implements RunnableFuture<T> {
  }
}