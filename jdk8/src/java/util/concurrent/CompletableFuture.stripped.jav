package java.util.concurrent;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.CompletionStage;

public class CompletableFuture<T> implements Future<T>, CompletionStage<T> {
  public static interface AsynchronousCompletionTask {
  }
  public CompletableFuture( ) {
  }
  public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CompletableFuture<Void> runAsync(Runnable runnable) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CompletableFuture<Void> runAsync(Runnable runnable, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static <U> CompletableFuture<U> completedFuture(U value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isDone( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T get( ) throws InterruptedException, ExecutionException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T join( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public T getNow(T valueIfAbsent) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean complete(T value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean completeExceptionally(Throwable ex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> thenApply(Function<? super T, ? extends U> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> thenApplyAsync(Function<? super T, ? extends U> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> thenApplyAsync(Function<? super T, ? extends U> fn, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> thenAccept(Consumer<? super T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> thenAcceptAsync(Consumer<? super T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> thenAcceptAsync(Consumer<? super T> action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> thenRun(Runnable action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> thenRunAsync(Runnable action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> thenRunAsync(Runnable action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U,V> CompletableFuture<V> thenCombine(CompletionStage<? extends U> other, BiFunction<? super T, ? super U, ? extends V> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U,V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other, BiFunction<? super T, ? super U, ? extends V> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U,V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other,BiFunction<? super T, ? super U, ? extends V> fn, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<Void> thenAcceptBoth(CompletionStage<? extends U> other, BiConsumer<? super T, ? super U> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U> other, BiConsumer<? super T, ? super U> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<Void> thenAcceptBothAsync(CompletionStage<? extends U> other,BiConsumer<? super T, ? super U> action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> runAfterBoth(CompletionStage<?> other, Runnable action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other, Runnable action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> runAfterBothAsync(CompletionStage<?> other,Runnable action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> applyToEither(CompletionStage<? extends T> other, Function<? super T, U> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> applyToEitherAsync(CompletionStage<? extends T> other, Function<? super T, U> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> applyToEitherAsync(CompletionStage<? extends T> other,Function<? super T, U> fn, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> acceptEither(CompletionStage<? extends T> other, Consumer<? super T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends T> other, Consumer<? super T> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> acceptEitherAsync(CompletionStage<? extends T> other,Consumer<? super T> action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> runAfterEither(CompletionStage<?> other, Runnable action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other, Runnable action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<Void> runAfterEitherAsync(CompletionStage<?> other,Runnable action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> thenCompose(Function<? super T, ? extends CompletionStage<U>> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> fn, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<T> whenComplete(BiConsumer<? super T, ? super Throwable> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<T> whenCompleteAsync(BiConsumer<? super T, ? super Throwable> action) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<T> whenCompleteAsync(BiConsumer<? super T, ? super Throwable> action, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> handle(BiFunction<? super T, Throwable, ? extends U> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> handleAsync(BiFunction<? super T, Throwable, ? extends U> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public <U> CompletableFuture<U> handleAsync(BiFunction<? super T, Throwable, ? extends U> fn, Executor executor) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<T> toCompletableFuture( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public CompletableFuture<T> exceptionally(Function<Throwable, ? extends T> fn) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CompletableFuture<Void> allOf(CompletableFuture<?> ... cfs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public static CompletableFuture<Object> anyOf(CompletableFuture<?> ... cfs) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean cancel(boolean mayInterruptIfRunning) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCancelled( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public boolean isCompletedExceptionally( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void obtrudeValue(T value) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public void obtrudeException(Throwable ex) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public int getNumberOfDependents( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
  public String toString( ) {
    throw new java . lang . RuntimeException ("Implementation stripped");
  }
}